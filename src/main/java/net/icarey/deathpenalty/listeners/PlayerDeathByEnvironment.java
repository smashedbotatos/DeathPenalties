package net.icarey.deathpenalty.listeners;

import net.icarey.deathpenalty.DeathPenalty;
import net.milkbowl.vault.economy.EconomyResponse;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang.enums.Enum;
import org.bukkit.ChatColor;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.*;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.projectiles.ProjectileSource;
import org.jetbrains.annotations.NotNull;

public class PlayerDeathByEnvironment implements Listener {
    private double am;
    private DeathPenalty plugin;

    public PlayerDeathByEnvironment(DeathPenalty plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDeath(@NotNull PlayerDeathEvent e) {
        Player p = (Player) e.getEntity();
        String cause = e.getEntity().getLastDamageCause().getCause().toString();

        if (!(e.getEntity().getKiller() instanceof Player)) {
            p.sendMessage(ChatColor.GREEN + cause);
        }

    }
}
