package com.tinyshellzz.customitemdemo;

import com.tinyshellzz.customitemdemo.config.PluginConfig;
import com.tinyshellzz.customitemdemo.item.TccPoisonPotato;
import com.tinyshellzz.customitemdemo.listener.PlayerJoinListener;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomItemDemo extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "+++++++++++++++++++");

        init();
        register();
        createItem();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void createItem() {
        TccPoisonPotato.createItem();
    }

    public void init(){
        ObjectPool.plugin = this;
        PluginConfig.reload();
    }

    public void register() {
        // 注册 Listeners
        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }
}
