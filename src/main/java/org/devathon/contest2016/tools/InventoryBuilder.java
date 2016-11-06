package org.devathon.contest2016.tools;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class InventoryBuilder {

    InventoryHolder holder;
    InventoryType type;
    String title;
    int size;

    Inventory inventory;

    public InventoryBuilder(InventoryHolder holder, String title, int size) {
        this.holder = holder;
        this.title = title;
        this.size = size;

        this.inventory = Bukkit.getServer().createInventory(holder, size, title);
    }

    public InventoryBuilder(InventoryHolder holder, InventoryType type, String title) {
        this.holder = holder;
        this.type = type;
        this.title = title;

        this.inventory = Bukkit.getServer().createInventory(holder, type, title);
    }

    public InventoryBuilder addItem(ItemStack... itemStack) {
        inventory.addItem(itemStack);
        return this;
    }

    public InventoryBuilder setItem(int position, ItemStack itemStack) {
        inventory.setItem(position, itemStack);
        return this;
    }

    public int getSize() {
        return size;
    }

    public InventoryType getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public InventoryHolder getHolder() {
        return holder;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
