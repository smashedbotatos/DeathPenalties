package net.icarey.deathpenalty;

import com.avaje.ebeaninternal.server.deploy.BeanDescriptor;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.projectiles.ProjectileSource;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public final class DeathPenalty extends JavaPlugin implements Listener{

    private static Economy econ = null;
    public static EconomyResponse r;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabling MobHunter");
        if (!setupEconomy() ) {
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    @EventHandler
    public void onEntityDamage(@NotNull EntityDamageByEntityEvent e){

        if(e.getDamager().getType() == EntityType.PLAYER){
            Player p = (Player) e.getDamager();
            Entity en = (Entity) e.getEntity();
            p.sendMessage(ChatColor.RED + "Hit: " + en);
            return;
        }

        if(e.getEntity().getType() == EntityType.PLAYER){
            Player p = (Player) e.getEntity();
            Damageable dmg = p;
            Entity en = e.getDamager();
            ProjectileSource sht = null;
            EntityType pjt = null;

            if (dmg.getHealth() - e.getDamage() <= 0D) {

                if (e.getDamager().getType() == EntityType.ZOMBIE) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.ARROW) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();
                        pjt = en.getType();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);
                    }
                } else {
                    p.sendMessage(ChatColor.GREEN + "Killed by:" + e.getDamager().getType() + e.getDamager().getEntityId());
                }
            }
        }

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logi
    }
}
