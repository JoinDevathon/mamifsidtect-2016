package org.devathon.contest2016.tools;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.Potion;

import java.util.ArrayList;

public class ItemstackBuilder {

    ItemStack itemStack;

    public ItemstackBuilder(Material material) {
        this.itemStack = new ItemStack(material);
    }

    public ItemstackBuilder(Material material, int amount) {
        this.itemStack = new ItemStack(material, amount);
    }

    public ItemstackBuilder(Potion potion, int amount, boolean extended, int level, boolean splash) {
        potion.setHasExtendedDuration(extended);
        potion.setLevel(level);
        potion.setSplash(splash);

        this.itemStack = potion.toItemStack(amount);
    }

    public ItemstackBuilder(Potion potion, boolean extended, int level, boolean splash) {
        potion.setHasExtendedDuration(extended);
        potion.setLevel(level);
        potion.setSplash(splash);

        this.itemStack = potion.toItemStack(1);
    }

    public ItemstackBuilder setType(Material material) {
        itemStack.setType(material);
        return this;
    }

    public ItemstackBuilder setData(byte damage) {
        itemStack.setDurability(damage);
        return this;
    }

    public ItemstackBuilder setData(MaterialData data) {
        itemStack.setData(data);
        return this;
    }

    public ItemstackBuilder setLore(String... lore) {
        ArrayList<String> loreLines = new ArrayList<String>();
        ItemMeta itemMeta = itemStack.getItemMeta();
        for (String string : lore) {
            loreLines.add(string);
        }
        itemMeta.setLore(loreLines);
        itemStack.setItemMeta(itemMeta);

        return this;
    }

    public ItemstackBuilder setDisplayName(String displayName) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);

        return this;
    }

    public ItemstackBuilder addEnchantments(int level, Enchantment... enchantments) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        for (Enchantment enchantment : enchantments) {
            itemMeta.addEnchant(enchantment, level, true);
        }
        itemStack.setItemMeta(itemMeta);

        return this;
    }

    public ItemMeta getItemMeta() {
        return itemStack.getItemMeta();
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
