package net.icarey.deathpenalty.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import net.icarey.deathpenalty.DeathPenalty;

public class PlayerJoin implements Listener {
    private DeathPenalty plugin;

    public PlayerJoin(DeathPenalty plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoins(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        if (this.plugin.deaths.contains(p.getUniqueId().toString() + "deaths")) {
            this.plugin.logger.info("[DeathPenalty] " + p.getName() + " has joined with " + this.plugin.getConfig().get("currency.label") + this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths") + " deaths!");
            this.plugin.logger.info("[DeathPenalty] " + p.getName() + " has joined with " + this.plugin.getConfig().get("currency.label") + this.plugin.deaths.getDouble(p.getUniqueId().toString() + "penalties") + " total currency lost!");
        } else {
            this.plugin.deaths.set(p.getUniqueId().toString() + "deaths", 0);
            this.plugin.deaths.set(p.getUniqueId().toString() + "penalties", 0);
            this.plugin.saveFile();
        }

    }
}
