package com.github.eisblume2000.roseBushDamage;

import com.github.eisblume2000.roseBushDamage.block.ROSEBUSH;
import org.bukkit.plugin.java.JavaPlugin;

public final class RoseBushDamage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ROSEBUSH(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
