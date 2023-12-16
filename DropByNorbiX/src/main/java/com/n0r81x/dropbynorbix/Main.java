package com.n0r81x.dropbynorbix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public final class Main extends JavaPlugin {
    boolean coaltoggle = true;
    boolean irontoggle = true;
    boolean goldtoggle = true;
    boolean diamondtoggle = true;
    boolean emeraldtoggle = true;

    String coalString;
    String ironString;
    String goldString;
    String diamondString;
    String emeraldString;

    //ITEMS
    ItemStack coalIS = new ItemStack(Material.COAL);
    ItemMeta coalMeta = coalIS.getItemMeta();
    ItemStack ironIS = new ItemStack(Material.IRON_INGOT);
    ItemMeta ironMeta = ironIS.getItemMeta();
    ItemStack goldIS = new ItemStack(Material.GOLD_INGOT);
    ItemMeta goldMeta = goldIS.getItemMeta();
    ItemStack diamondIS = new ItemStack(Material.DIAMOND);
    ItemMeta diamondMeta = diamondIS.getItemMeta();
    ItemStack emeraldIS = new ItemStack(Material.EMERALD);
    ItemMeta emeraldMeta = emeraldIS.getItemMeta();

    //ENABLED
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("drop").setExecutor(new DropCommand(this));
        Bukkit.getPluginManager().registerEvents(new InventoryEvent(this), this);
        Bukkit.getPluginManager().registerEvents(new DropEvent(this), this);
        coalString = "§2ENABLED";
        ironString = "§2ENABLED";
        goldString = "§2ENABLED";
        diamondString = "§2ENABLED";
        emeraldString = "§2ENABLED";
        //ITEM META
        coalMeta.setLore(Arrays.asList(coalString));
        coalIS.setItemMeta(coalMeta);
        ironMeta.setLore(Arrays.asList(ironString));
        ironIS.setItemMeta(ironMeta);
        goldMeta.setLore(Arrays.asList(goldString));
        goldIS.setItemMeta(goldMeta);
        diamondMeta.setLore(Arrays.asList(diamondString));
        diamondIS.setItemMeta(diamondMeta);
        emeraldMeta.setLore(Arrays.asList(emeraldString));
        emeraldIS.setItemMeta(emeraldMeta);

    }

    @Override
    public void onDisable() {
    }
}
