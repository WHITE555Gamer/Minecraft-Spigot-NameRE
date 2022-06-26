package com.github.white555gamer.namere;

import com.github.white555gamer.namere.assets.Commands_NameRE;
import org.bukkit.plugin.java.JavaPlugin;

import static com.github.white555gamer.namere.assets.NameRE_assets.version.NameRE_CurrentVersion;

public final class NameRE extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("------------------------------");
        getLogger().info("NameRE v." + NameRE_CurrentVersion + " is Enabling...");
        getLogger().info("Thanks for using NameRE!");
        getLogger().info("------------------------------");

        getCommand("NameRE").setExecutor(new Commands_NameRE());
    }

    @Override
    public void onLoad() {
        getLogger().info("NameRE is Loading...");
    }

    @Override
    public void onDisable() {
        getLogger().info("------------------------------");
        getLogger().info("NameRE is Disabling...");
        getLogger().info("Thanks for using NameRE!");
        getLogger().info("------------------------------");
    }
}
