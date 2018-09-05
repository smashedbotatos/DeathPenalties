package net.icarey.deathpenalty;

import net.icarey.deathpenalty.commands.DeathPenaltyCmd;
import net.icarey.deathpenalty.commands.DeathPenaltyTabComp;
import net.icarey.deathpenalty.listeners.PlayerDeathByEntity;
import net.icarey.deathpenalty.listeners.PlayerDeathByEnvironment;
import net.icarey.deathpenalty.listeners.PlayerJoin;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.InvalidConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public final class DeathPenalty extends JavaPlugin {
    public final Logger logger = Logger.getLogger("Minecraft");
    public static DeathPenalty plugin;
    public String Prefix;
    private File deathfile = new File(this.getDataFolder() + "/data/death_data.yml");
    public FileConfiguration deaths;
    public FileConfiguration totalcash;
    public static Economy econ = null;

    public DeathPenalty(){
        this.deaths = YamlConfiguration.loadConfiguration(this.deathfile);
        this.totalcash = YamlConfiguration.loadConfiguration(this.deathfile);
    }

    @Override
    public void onEnable() {
        plugin = this;
        if (this.setupPlug()) {
            this.logger.info(String.format("[%s] DeathPenalty has been enabled Version: %s", this.getDescription().getName(), this.getDescription().getVersion()));
            this.loadMethod();
            if (!this.setupEconomy()) {
                this.logger.severe(String.format("[%s] - Disabled due to no Vault or Economy plugin!", this.getDescription().getName()));
                Bukkit.getPluginManager().disablePlugin(this);
                return;
            }

            this.loadFile();
            this.registerConfig();
        } else {
            this.getLogger().severe("Failed to load DeathPenalty!");
            this.getLogger().severe("Your server version is not compatible with this plugin!");
            this.getLogger().severe("Usable Versions: 1.13.1");
            Bukkit.getPluginManager().disablePlugin(this);
        }

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

    public void saveFile() {
        try {
            this.deaths.save(this.deathfile);
        } catch (IOException var2) {
            var2.printStackTrace();
        }

    }

    private void loadFile() {
        if (this.deathfile.exists()) {
            try {
                this.deaths.load(this.deathfile);
            } catch (InvalidConfigurationException | IOException var3) {
                var3.printStackTrace();
            }
        } else {
            try {
                this.deaths.save(this.deathfile);
            } catch (IOException var2) {
                var2.printStackTrace();
            }
        }

    }

    private void registerConfig() {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

    private void loadMethod() {

        this.getCommand("deathpenalty").setExecutor(new DeathPenaltyCmd(this));
        this.getCommand("deathpenalty").setTabCompleter(new DeathPenaltyTabComp());
        this.Prefix = ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("Prefix"));

        }

    private boolean setupPlug() {
        String version;
        try {
            version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
        } catch (ArrayIndexOutOfBoundsException var3) {
            return false;
        }
        this.getLogger().info("Your server is running version " + version);
        if (version.equals("v1_13_R2")){
            Bukkit.getServer().getPluginManager().registerEvents(new PlayerDeathByEntity(this), this);
            Bukkit.getServer().getPluginManager().registerEvents(new PlayerDeathByEnvironment(this), this);
            Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
        }

        return version.equals("v1_13_R2");
    }
    @Override
    public void onDisable() {
        this.logger.info("DeathPenalty for 1.13 has been disabled correctly!");
        this.logger.info("Saving the file: death_data.yml");
        this.saveFile();
    }
}
