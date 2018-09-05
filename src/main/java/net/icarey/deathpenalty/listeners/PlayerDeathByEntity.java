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

public class PlayerDeathByEntity implements Listener {
    private double am;
    private DeathPenalty plugin;

    public PlayerDeathByEntity(DeathPenalty plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDeath(@NotNull EntityDamageByEntityEvent e){

        if (e.getDamager().getType() == EntityType.PLAYER && e.getEntity().getType() == EntityType.PLAYER) {
            Player p = (Player) e.getEntity();
            Player k = (Player) e.getDamager();

            if (p.getHealth() - e.getDamage() <= 0D) {
                if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                    this.pvpPenalty(k, p);
                } else {
                    p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                }
            }
        } else if (e.getEntity().getType() == EntityType.PLAYER) {
            Player p = (Player) e.getEntity();
            Entity en = e.getDamager();
            ProjectileSource sht;

            if (p.getHealth() - e.getDamage() <= 0D) {

                if (e.getDamager().getType() == EntityType.BLAZE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.CAVE_SPIDER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.CREEPER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.DOLPHIN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.DROWNED) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.ELDER_GUARDIAN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ENDER_DRAGON) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ENDERMAN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ENDERMITE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.EVOKER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.EVOKER_FANGS) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.GHAST) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.GUARDIAN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.HUSK) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.IRON_GOLEM) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.MAGMA_CUBE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.PHANTOM) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.PRIMED_TNT) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }
                } else if (e.getDamager().getType() == EntityType.SNOWMAN) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SILVERFISH) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SKELETON) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SLIME) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.SPIDER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.STRAY) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.VEX) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.VINDICATOR) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.WITCH) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.WITHER_SKELETON) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ZOMBIE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {

                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.PIG_ZOMBIE) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ZOMBIE_VILLAGER) {
                    String mobtype = e.getDamager().getType().toString().toLowerCase();
                    if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                        this.penaltyCollect(mobtype, p);
                    } else {
                        p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                    }

                } else if (e.getDamager().getType() == EntityType.ARROW) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Stray) {
                            String mobtype = "stray";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Skeleton) {
                            String mobtype = "skeleton";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.DARK_RED + "DeathPenalty has encuntered and error.");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.DRAGON_FIREBALL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof EnderDragon) {
                            String mobtype = "ender_dragon";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "DRAGON_FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.EGG) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "DRAGON_FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.ENDER_PEARL) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
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
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Ghast) {
                            String mobtype = "ghast";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
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
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Ghast) {
                            String mobtype = "ghast";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.FISHING_HOOK) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "DRAGON_FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.LINGERING_POTION) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "DRAGON_FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.LLAMA_SPIT) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Llama) {
                            String mobtype = "llama";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
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
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
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
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "Snowball skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.SPECTRAL_ARROW) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Stray) {
                            String mobtype = "stray";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Skeleton) {
                            String mobtype = "skeleton";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.DARK_RED + "DeathPenalty has encountered an error.");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.SPLASH_POTION) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Witch) {
                            String mobtype = "witch";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "SPLASH_POTION skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.THROWN_EXP_BOTTLE) {
                    if (en instanceof Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                            }
                        } else {
                            p.sendMessage(ChatColor.RED + "DRAGON_FIREBALL skipped checks");
                        }
                    }
                } else if (e.getDamager().getType() == EntityType.TIPPED_ARROW ) {
                    if (en instanceof  Projectile) {
                        sht = ((Projectile) en).getShooter();

                        if (sht instanceof Stray){
                            String mobtype = "stray";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Skeleton){
                            String mobtype = "skeleton";
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
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
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, mob penalties disabled.");
                            }
                        } else if (sht instanceof Player) {
                            Player k = ((Player) sht).getPlayer();
                            if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                this.pvpPenalty(k, p);
                            } else {
                                p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
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
                            if (this.plugin.getConfig().getBoolean("mob_penalty_enabled")) {
                                this.penaltyCollect(mobtype, p);
                            } else if (sht instanceof Player) {
                                Player k = ((Player) sht).getPlayer();
                                if (this.plugin.getConfig().getBoolean("pvp_penalty_enabled")) {
                                    this.pvpPenalty(k, p);
                                } else {
                                    p.sendMessage(ChatColor.GREEN + "You got lucky, pvp penalties disabled.");
                                }
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
        EconomyResponse er;
        Double bal;
        int deaths;
        double totalcash;

        if (this.plugin.getConfig().getBoolean("penalty_is_percent")) {
            Double per = this.plugin.getConfig().getDouble(mobtype + ".penalty");
            bal = DeathPenalty.econ.getBalance(p);
            if (per <= 1 || per > 0) {
                this.am = bal * per;
                double roundedam = Math.round(am * 100 / 100);
                er = DeathPenalty.econ.withdrawPlayer(p, roundedam);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    totalcash = roundedam + this.plugin.totalcash.getDouble(p.getUniqueId().toString() + "penalties");
                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", totalcash);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + "Dying to " + WordUtils.capitalizeFully(mobtype.replaceAll("_", " ")) + " cost you " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + am + ChatColor.RED + "!");
                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }

            } else {
                p.sendMessage(ChatColor.RED + "The percentage amount in config.yml is incorrect. Contact an Admin.");
            }
        } else if (!this.plugin.getConfig().getBoolean("penalty_is_percent")) {
            am = this.plugin.getConfig().getDouble(mobtype + ".penalty");
            bal = DeathPenalty.econ.getBalance(p);

            if (!(am > bal)) {
                er = DeathPenalty.econ.withdrawPlayer(p, am);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    totalcash = am + this.plugin.totalcash.getDouble(p.getUniqueId().toString() + "penalties");
                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", totalcash);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + "Dying to " + WordUtils.capitalizeFully(mobtype.replaceAll("_", " ")) + " cost you " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + am + ChatColor.RED + "!");
                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }
            } else if (am > bal) {
                er = DeathPenalty.econ.withdrawPlayer(p, bal);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    totalcash = bal + this.plugin.totalcash.getDouble(p.getUniqueId().toString() + "penalties");
                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", totalcash);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + "Dying to " + WordUtils.capitalizeFully(mobtype.replaceAll("_", " ")) + " cost you " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + bal + ChatColor.RED + "!");
                    p.sendMessage(ChatColor.DARK_RED + "Your balance is now " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + "0" + ChatColor.DARK_RED + ".");
                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }
            }
        } else {
            p.sendMessage(ChatColor.DARK_RED + "Something went wrong.");
        }

    }

    private void pvpPenalty(Player k, Player p) {
        EconomyResponse er;
        int deaths;
        double totalcash;
        double bal;

        if (this.plugin.getConfig().getBoolean("pvp_penalty_is_percent")) {

            double per = this.plugin.getConfig().getDouble("player.penalty");
            if (per <= 1 || per > 0) {
                bal = DeathPenalty.econ.getBalance(p);
                this.am = bal * per;
                double roundedam = Math.round(am * 100 / 100);
                er = DeathPenalty.econ.withdrawPlayer(p, roundedam);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    totalcash = bal + this.plugin.totalcash.getDouble(p.getUniqueId().toString() + "penalties");
                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", totalcash);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + k.getName() + " robbed you for " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + roundedam);
                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }
                if (this.plugin.getConfig().getBoolean("pvp_penalty_to_killer")) {
                    er = DeathPenalty.econ.depositPlayer(k, roundedam);
                    if (er.transactionSuccess()) {
                        k.sendMessage(ChatColor.RED + "You have taken " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + roundedam + ChatColor.RED + " from " + ChatColor.GREEN + p.getName() + ChatColor.RED + "'s corpse.");
                    } else {
                        p.sendMessage(ChatColor.RED + "An error occured %s");
                    }
                } else {
                    k.sendMessage(ChatColor.GREEN + "Sorry, no pvp reward was enabled.");
                }
            } else {
                p.sendMessage(ChatColor.RED + "The percentage amount in config.yml is incorrect. Contact an Admin.");
            }

        } else if (!this.plugin.getConfig().getBoolean("pvp_penalty_is_percent")) {
            bal = DeathPenalty.econ.getBalance(p);
            am = this.plugin.getConfig().getDouble("player.penalty");
            if (!(am > bal)) {
                er = DeathPenalty.econ.withdrawPlayer(p, am);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    totalcash = am + this.plugin.totalcash.getDouble(p.getUniqueId() + "penalties");
                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", totalcash);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + k.getName() + " robbed you for " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + am);

                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }
                if (this.plugin.getConfig().getBoolean("pvp_penalty_to_killer")) {
                    er = DeathPenalty.econ.depositPlayer(k, am);
                    if (er.transactionSuccess()) {
                        k.sendMessage(ChatColor.RED + "You have taken " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + am + ChatColor.RED + " from " + ChatColor.GREEN + p.getName() + ChatColor.RED + "'s corpse.");
                    } else {
                        p.sendMessage(ChatColor.RED + "An error occured %s");
                    }
                } else {
                    k.sendMessage(ChatColor.GREEN + "Sorry, no pvp reward was enabled.");

                }
            } else if (am > bal) {
                er = DeathPenalty.econ.withdrawPlayer(p, bal);
                if (er.transactionSuccess()) {
                    deaths = this.plugin.deaths.getInt(p.getUniqueId().toString() + "deaths");
                    ++deaths;
                    totalcash = bal + this.plugin.totalcash.getDouble(p.getUniqueId().toString() + "penalties");
                    this.plugin.deaths.set(p.getUniqueId() + "deaths", deaths);
                    this.plugin.deaths.set(p.getUniqueId() + "penalties", totalcash);
                    this.plugin.saveFile();
                    p.sendMessage(ChatColor.RED + k.getName() + " robbed you for" + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + bal + ChatColor.RED + ".");
                    p.sendMessage(ChatColor.DARK_RED + "Your balance is now" + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + "0" + ChatColor.DARK_RED + ".");

                } else {
                    p.sendMessage(ChatColor.RED + "An error occured %s");
                }
                if (this.plugin.getConfig().getBoolean("pvp_penalty_to_killer")) {
                    er = DeathPenalty.econ.depositPlayer(k, bal);
                    if (er.transactionSuccess()) {
                        k.sendMessage(ChatColor.GREEN + p.getName() + ChatColor.RED + "didn't have enough to pay the penalty, so you took " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + bal + ChatColor.RED + " and made their account " + ChatColor.GREEN + this.plugin.getConfig().get("currency.label") + "0" + ChatColor.RED + "!");
                    } else {
                        p.sendMessage(ChatColor.RED + "An error occured %s");
                    }
                } else {
                    k.sendMessage(ChatColor.GREEN + "Sorry, no pvp reward was enabled.");

                }
            }
        } else {
            p.sendMessage(ChatColor.DARK_RED + "Something went wrong.");
            k.sendMessage(ChatColor.DARK_RED + "Something went wrong.");
        }
    }
}