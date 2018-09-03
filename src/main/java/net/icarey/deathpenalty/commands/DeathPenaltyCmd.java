package net.icarey.deathpenalty.commands;

import net.icarey.deathpenalty.DeathPenalty;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DeathPenaltyCmd implements CommandExecutor {
    private DeathPenalty plugin;

    public DeathPenaltyCmd(DeathPenalty plugin) { this.plugin = plugin; }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if (!(p instanceof Player)) {
            return true;
        } else {
            if (command.getName().equalsIgnoreCase("deathpenalty")) {
                if (args.length == 0) {
                    if (p.hasPermission( "deathpenalty.help")){
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8---------[&aDeathPenalty&8]---------"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Plugin Developed by: &aSmashedbotatos"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', String.format("&7Version: &a %s", this.plugin.getDescription().getVersion())));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7For the list of commands do &a/dp help&7."));

                    } else {
                        p.sendMessage((this.plugin.Prefix + ChatColor.DARK_RED + "You do not have permission."));
                    }
                } else if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
                    if (p.hasPermission("deathpenalty.help")) {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8+++++++++++[&cDeathPenalty Help&8]++++++++"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a/DeathPenalty help &7 Get the help page."));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAdmin: &a/DeathPenalty reload &7 Reload the config files."));
                    }
                } else {
                    if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
                        if (p.hasPermission("deathpenalty.reload")) {
                            this.plugin.reloadConfig();
                            p.sendMessage(this.plugin.Prefix + ChatColor.GREEN + "The config files were reloaded!");
                            this.plugin.logger.info("[DeathPenalty] The config files were reloaded!");
                        } else {
                            p.sendMessage((this.plugin.Prefix + ChatColor.DARK_RED + "You do not have permission."));
                        }
                    } else {
                        p.sendMessage(this.plugin.Prefix + ChatColor.DARK_RED + " Error: That is not a command. Do /dp help for a list of commands.");
                    }
                }
            }
        return false;
        }
    }
}
