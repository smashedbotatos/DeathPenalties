package net.icarey.deathpenalty;


import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.projectiles.ProjectileSource;
import org.jetbrains.annotations.NotNull;

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

            if (dmg.getHealth() - e.getDamage() <= 0D) {
                //Neutral Mob Checks
                if (e.getDamager().getType() == EntityType.DOLPHIN) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.LLAMA) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.POLAR_BEAR) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.WOLF) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                //Hostile Mob Checks
                else if (e.getDamager().getType() == EntityType.CAVE_SPIDER) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.ENDERMAN) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.EVOKER_FANGS) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.SPIDER) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.PIG_ZOMBIE) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.BLAZE) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.CREEPER) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.DROWNED) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.ELDER_GUARDIAN) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.ENDER_DRAGON) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.ENDERMITE) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.EVOKER) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.GHAST) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.GUARDIAN) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.HUSK) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.IRON_GOLEM) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.MAGMA_CUBE) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.PHANTOM) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.SNOWMAN) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.SILVERFISH) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.SKELETON) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.SLIME) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.STRAY) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.VEX) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.VINDICATOR) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.WITCH) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.WITHER_SKELETON) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.ZOMBIE) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }
                else if (e.getDamager().getType() == EntityType.ZOMBIE_VILLAGER) {
                    p.sendMessage(ChatColor.RED + "Killed by: " + e.getDamager().getType() + e.getDamager().getEntityId());
                }

                else if (e.getDamager().getType() == EntityType.ARROW) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Stray) {
                            p.sendMessage(ChatColor.RED + "ARROW came from Stray");
                        } else if (sht instanceof Skeleton) {
                            p.sendMessage(ChatColor.RED + "ARROW came from Skeleton");
                        } else {
                            p.sendMessage(ChatColor.RED + "ARROW skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.DRAGON_FIREBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof EnderDragon) {
                            p.sendMessage(ChatColor.RED + "DRAGON_FIREBALL came from Ender Dragon");
                        } else {
                            p.sendMessage(ChatColor.RED + "DRAGON_FIREBALL skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.FIREBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Blaze) {
                            p.sendMessage(ChatColor.RED + "FIREBALL came from Blaze");
                        } else if (sht instanceof Ghast) {
                            p.sendMessage(ChatColor.RED + "FIREBALL came from Ghast");
                        } else {
                            p.sendMessage(ChatColor.RED + "FIREBALL skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.SMALL_FIREBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Blaze) {
                            p.sendMessage(ChatColor.RED + "FIREBALL came from Blaze");
                        } else if (sht instanceof Ghast) {
                            p.sendMessage(ChatColor.RED + "FIREBALL came from Ghast");
                        } else {
                            p.sendMessage(ChatColor.RED + "FIREBALL skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.LLAMA_SPIT) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Llama) {
                            p.sendMessage(ChatColor.RED + "LLAMA_SPIT came from Blaze");
                        } else {
                            p.sendMessage(ChatColor.RED + "LLAMA_SPIT skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.SHULKER_BULLET) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Shulker) {
                            p.sendMessage(ChatColor.RED + "SHULKER_BULLET came from SHULKER");
                        } else {
                            p.sendMessage(ChatColor.RED + "SHULKER_BULLET skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.SNOWBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Snowman) {
                            p.sendMessage(ChatColor.RED + "SNOWBALL came from Snowman");
                        } else {
                            p.sendMessage(ChatColor.RED + "Snowball skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.SPLASH_POTION) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Witch) {
                            p.sendMessage(ChatColor.RED + "SPLASH_POTION came from Witch");
                        } else {
                            p.sendMessage(ChatColor.RED + "SPLASH_POTION skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.TIPPED_ARROW ) {
                    if (en instanceof  Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Stray){
                            p.sendMessage(ChatColor.RED + "TIPPED_ARROW came from Stray");
                        }
                        else if (sht instanceof Skeleton){
                            p.sendMessage(ChatColor.RED + "TIPPED_ARROW came from Skeleton");
                        }
                        else {
                            p.sendMessage(ChatColor.RED + "TIPPED_ARROW skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.TRIDENT ) {
                    if (en instanceof  Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Drowned){
                            p.sendMessage(ChatColor.RED + "TRIDENT came from Drowned");
                        }
                        else {
                            p.sendMessage(ChatColor.RED + "TRIDENT skipped checks");
                        }
                    }
                }
                else if (e.getDamager().getType() == EntityType.WITHER_SKULL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        p.sendMessage(ChatColor.RED + "Killed by: " + sht);

                        if (sht instanceof Wither) {
                            p.sendMessage(ChatColor.RED + "WITHER_SKULL came from WITHER");
                        } else {
                            p.sendMessage(ChatColor.RED + "WITHER_SKULL skipped checks");
                        }
                    }
                }
                else {
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
