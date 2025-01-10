package com.github.eisblume2000.roseBushDamage.block;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.Location;


public class ROSEBUSH implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onMove(PlayerMoveEvent event) {
       boolean changedblock = event.hasChangedBlock();
       if (changedblock = true) {
           Player player = event.getPlayer();
           Location location = player.getLocation();
           String block = location.getBlock().getType().toString();
           if (block == "ROSE_BUSH") {
               player.damage(1);
           }
       }

    }
}