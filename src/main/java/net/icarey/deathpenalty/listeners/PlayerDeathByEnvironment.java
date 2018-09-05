package net.icarey.deathpenalty.listeners;

import net.icarey.deathpenalty.DeathPenalty;
import net.milkbowl.vault.economy.EconomyResponse;
import org.apache.commons.lang.WordUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class PlayerDeathByEnvironment implements Listener {
    private double am;
    public DeathPenalty plugin;

    public PlayerDeathByEnvironment(DeathPenalty plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDeath(@NotNull PlayerDeathEvent e) {
        Player p = (Player) e.getEntity();
        PlayerDeathByEntity pen = null;
        String cause = e.getEntity().getLastDamageCause().getCause().toString();
        EntityDamageEvent.DamageCause ent = e.getEntity().getLastDamageCause().getCause();
        String[] causeArray = {"CUSTOM", "DRYOUT", "ENTITY_ATTACK", "ENTITY_EXPLOSION", "ENTITY_SWEEP_ATTACK", "MAGIC", "MELTING", "POISON", "PROJECTILE"};

        if (e.getEntity().getLastDamageCause().getCause() != null) {
            if (this.plugin.getConfig().getBoolean("env_penalty_enabled")) {

                if (!(Arrays.asList(causeArray).contains(cause))) {
                    this.envPenalty(cause.toLowerCase(), p);
                } else if (Arrays.asList(causeArray).contains(cause)) {
                    return;
                } else {
                    p.sendMessage(ChatColor.GREEN + "Something killed you but it wasn't on the list: " + WordUtils.capitalizeFully(cause.replaceAll("_", " ")));
                }
            } else if (!(this.plugin.getConfig().getBoolean("env_penalty_enabled"))) {
                p.sendMessage(ChatColor.GREEN + "You got lucky, environmental penalties disabled.");
            } else {
                p.sendMessage(ChatColor.DARK_RED + "Something went wrong, contact and Admin.");
            }
        } else {
            p.sendMessage(ChatColor.GREEN + cause);
        }
    }

    private void envPenalty(String c, Player p) {
        EconomyResponse er = null;
        Double bal = null;
        int deaths;
        double current;
        double totalcash;

        if (this.plugin.getConfig().getBoolean("env_penalty_is_percent")) {
            Double per = this.plugin.getConfig().getDouble(c + ".penalty");
            if (per <= 1 || per > 0) {
                bal = DeathPenalty.econ.getBalance(p);
                this.am = bal * per;
                double roundedam = Math.round(am * 100 / 100);
                er = DeathPenalty.econ.withdrawPlayer(p, roundedam);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    current = this.plugin.deaths.getDouble(p.getUniqueId().toString() + "penalties");
                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", current + roundedam);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + "Dying to " + WordUtils.capitalizeFully(c.replaceAll("_", " ")) + " cost you " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + roundedam + ChatColor.RED + "!");
                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }
            } else {
                p.sendMessage(ChatColor.RED + "The percentage amount in config.yml is incorrect. Contact an Admin.");
            }

        } else if (!(this.plugin.getConfig().getBoolean("env_penalty_is_percent"))) {
            am = this.plugin.getConfig().getDouble(c + ".penalty");
            bal = DeathPenalty.econ.getBalance(p);
            if (am <= bal) {
                er = DeathPenalty.econ.withdrawPlayer(p, am);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    current = this.plugin.deaths.getDouble(p.getUniqueId().toString() + "penalties");
                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", current + am);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + "Dying to " + WordUtils.capitalizeFully(c.replaceAll("_", " ")) + " cost you " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + am + ChatColor.RED + "!");
                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }
            } else if (am > bal) {
                er = DeathPenalty.econ.withdrawPlayer(p, bal);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    current = this.plugin.deaths.getDouble(p.getUniqueId().toString() + "penalties");

                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", current + bal);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + "Dying to " + WordUtils.capitalizeFully(c.replaceAll("_", " ")) + " cost you " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + bal + ChatColor.RED + "!");
                    p.sendMessage(ChatColor.DARK_RED + "Your balance is now " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + "0" + ChatColor.DARK_RED + ".");
                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }
            }
        } else {
            p.sendMessage(ChatColor.DARK_RED + "Something went wrong.");
        }

    }
}