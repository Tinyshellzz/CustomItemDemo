package com.tinyshellzz.customitemdemo.listener;

import com.tinyshellzz.customitemdemo.utils.ItemStackManager;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void handle(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        ItemStackManager.load("tcc_server");
        player.getInventory().addItem(ItemStackManager.getItem("tcc_server"));
    }
}
