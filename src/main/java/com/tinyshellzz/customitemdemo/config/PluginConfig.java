package com.tinyshellzz.customitemdemo.config;


import static com.tinyshellzz.customitemdemo.ObjectPool.plugin;

public class PluginConfig {
    public static String msg;

    private static ConfigWrapper config = new ConfigWrapper(plugin, "config.yml");
    public static void reload() {
        config.reloadConfig(); // 重新加载配置文件

        msg =  config.getConfig().getString("msg");
    }
}
