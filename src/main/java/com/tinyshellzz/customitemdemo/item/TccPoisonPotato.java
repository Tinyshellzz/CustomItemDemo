package com.tinyshellzz.customitemdemo.item;


import com.tinyshellzz.customitemdemo.utils.ItemStackManager;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.Arrays;

import static com.tinyshellzz.customitemdemo.ObjectPool.plugin;

public class TccPoisonPotato {
    public static ItemStack tccPotato;

    public static ItemStack getItem() {
        if(tccPotato == null) {
            tccPotato = createItem();
        }

        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + tccPotato.toString());
        return tccPotato;
    }

    public static ItemStack createItem() {
        ItemStack customPoisonPotato = new ItemStack(org.bukkit.Material.POTATO);
        ItemMeta meta = customPoisonPotato.getItemMeta();

        meta.setCustomModelData(7);

        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "TCC服务器");
        meta.setLore(Arrays.asList(
                ChatColor.WHITE + "破烂",
                ChatColor.GRAY + "虽然这玩意无论如何看起来都是个土豆的样",
                ChatColor.GRAY + "但你确信,它是,或者说,曾经是一个Minecraft服务",
                ChatColor.YELLOW + "来源",
                ChatColor.AQUA + "服务器崩溃后在机房获得"));

        NamespacedKey TccPotato = new NamespacedKey(plugin, "customPoisonPotato");
        meta.getPersistentDataContainer().set(TccPotato, PersistentDataType.BOOLEAN, true);

        customPoisonPotato.setItemMeta(meta);
        addRecipe(TccPotato, customPoisonPotato);
        ItemStackManager.save("customPoisonPotato", customPoisonPotato);

        return customPoisonPotato;
    }

    private static void addRecipe(NamespacedKey TccPotato, ItemStack item) {
        ShapedRecipe recipe = new ShapedRecipe(TccPotato, item);

        recipe.shape("aaa", "aba", "aaa");
        recipe.setIngredient('a', org.bukkit.Material.POTATO);
        recipe.setIngredient('b', org.bukkit.Material.POISONOUS_POTATO);

        Bukkit.addRecipe(recipe);
    }
}
