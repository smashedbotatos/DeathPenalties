package net.icarey.deathpenalty.listeners;

import net.icarey.deathpenalty.DeathPenalty;
import net.milkbowl.vault.economy.EconomyResponse;
import org.apache.commons.lang.WordUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.projectiles.ProjectileSource;
import org.jetbrains.annotations.NotNull;

public class PlayerDeathByMob implements Listener {
    private double am;
    private String amount;
    private DeathPenalty plugin;

    public PlayerDeathByMob(DeathPenalty plugin) { this.plugin = plugin; }

    @EventHandler
    public void onDeath(@NotNull EntityDamageByEntityEvent e){

        if(e.getDamager().getType() == EntityType.PLAYER){
            Player p = (Player) e.getDamager();
            Entity en = (Entity) e.getEntity();
            p.sendMessage(ChatColor.RED + "Hit: " + en); //Debug Line
            return;
        }

        if(e.getEntity().getType() == EntityType.PLAYER){
            Player p = (Player) e.getEntity();
            Entity en = e.getDamager();
            ProjectileSource sht = null;

            if (p.getHealth() - e.getDamage() <= 0D) {

                if (e.getDamager().getType() == EntityType.BLAZE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.CAVE_SPIDER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.CREEPER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.DOLPHIN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.DROWNED) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.ELDER_GUARDIAN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ENDER_DRAGON) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ENDERMAN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ENDERMITE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.EVOKER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.EVOKER_FANGS) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.GHAST) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.GUARDIAN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.HUSK) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.IRON_GOLEM) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.MAGMA_CUBE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.PHANTOM) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SNOWMAN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SILVERFISH) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SKELETON) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SLIME) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SPIDER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.STRAY) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.VEX) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.VINDICATOR) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.WITCH) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.WITHER_SKELETON) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ZOMBIE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.PIG_ZOMBIE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ZOMBIE_VILLAGER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ARROW) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Stray) {
                            String mobtype = "stray";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Skeleton) {
                            String mobtype = "skeleton";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "??? Profit");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.DRAGON_FIREBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof EnderDragon) {
                            String mobtype = "ender_dragon";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "DRAGON_FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.FIREBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Blaze) {
                            String mobtype = "blaze";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Ghast) {
                            String mobtype = "ghast";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.SMALL_FIREBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Blaze) {
                            String mobtype = "blaze";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Ghast) {
                            String mobtype = "ghast";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.LLAMA_SPIT) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Llama) {
                            String mobtype = "llama";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "LLAMA_SPIT skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.SHULKER_BULLET) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Shulker) {
                            String mobtype = "shulker";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "SHULKER_BULLET skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.SNOWBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Snowman) {
                            String mobtype = "snow_golem";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "Snowball skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.SPLASH_POTION) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Witch) {
                            String mobtype = "witch";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "SPLASH_POTION skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.TIPPED_ARROW ) {
                    if (en instanceof  Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Stray){
                            String mobtype = "stray";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Skeleton){
                            String mobtype = "skeleton";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "TIPPED_ARROW skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.TRIDENT ) {
                    if (en instanceof  Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Drowned){
                            String mobtype = "drowned";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "TRIDENT skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.WITHER_SKULL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Wither) {
                            String mobtype = "wither";
                            if (this.plugin.getConfig().getBoolean("penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "WITHER_SKULL skipped checks");
                        }
                    }
                } else {
                    p.sendMessage(ChatColor.GREEN + "Killed by: " + e.getDamager().getType() + " Contact Author to add more mobs!");
                }
            }
        }

    }

    private void penaltyCollect(String mobtype, Player p) {
        EconomyResponse er = null;
        Double pen = null;
        if (this.plugin.getConfig().getBoolean("penalty_is_percent")) {
            Double per = this.plugin.getConfig().getDouble(mobtype + ".penalty");
            if (per <= 1 || per > 0) {
                pen = DeathPenalty.econ.getBalance(p);
                this.am = pen * per;
                double roundedam = Math.round(am * 100 / 100);
                er = DeathPenalty.econ.withdrawPlayer(p, roundedam);
                if (er.transactionSuccess()) {
                    p.sendMessage(ChatColor.RED + "Dieing to " + WordUtils.capitalizeFully(mobtype.replaceAll("_", " ")) + " cost you " + roundedam);
                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }

            } else {
                p.sendMessage(ChatColor.RED + "The percentage amount in config.yml is incorrect. Contact an Admin.");
            }
        } else if (!this.plugin.getConfig().getBoolean("penalty_is_percent")) {
            am = this.plugin.getConfig().getDouble(mobtype + ".penalty");
            er = DeathPenalty.econ.withdrawPlayer(p, am);
            if (er.transactionSuccess()) {
                p.sendMessage(ChatColor.RED + "Dieing to " + WordUtils.capitalizeFully(mobtype.replaceAll("_", " ")) + " cost you " + am);
            } else {
                p.sendMessage(ChatColor.RED + "An error occured %s");
            }

        } else {
            p.sendMessage(ChatColor.DARK_RED + "Something went wrong.");
        }

    }
}
