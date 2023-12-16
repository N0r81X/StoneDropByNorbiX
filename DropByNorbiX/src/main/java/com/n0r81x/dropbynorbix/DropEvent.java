package com.n0r81x.dropbynorbix;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.concurrent.ThreadLocalRandom;

public class DropEvent implements Listener {
    private Main main;
    public DropEvent(Main main){this.main = main;}
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        ItemStack coalIS = new ItemStack(Material.COAL);
        ItemStack ironIS = new ItemStack(Material.IRON_INGOT);
        ItemStack goldIS = new ItemStack(Material.GOLD_INGOT);
        ItemStack diamondIS = new ItemStack(Material.DIAMOND);
        ItemStack emeraldIS = new ItemStack(Material.EMERALD);
        if(e.getBlock().getType().equals(Material.STONE)) {
            if (ThreadLocalRandom.current().nextInt(100) <= main.getConfig().getInt("Coal")) {
                if (main.coaltoggle == true) {
                    player.getInventory().addItem(coalIS);
                }
            }
            if (ThreadLocalRandom.current().nextInt(100) <= main.getConfig().getInt("Iron")) {
                if (main.irontoggle == true) {
                    player.getInventory().addItem(ironIS);
                }
            }
            if (ThreadLocalRandom.current().nextInt(100) <= main.getConfig().getInt("Gold")) {
                if (main.goldtoggle == true) {
                    player.getInventory().addItem(goldIS);
                }
            }
            if (ThreadLocalRandom.current().nextInt(100) <= main.getConfig().getInt("Diamond")) {
                if (main.diamondtoggle == true) {
                    player.getInventory().addItem(diamondIS);
                }
            }
            if (ThreadLocalRandom.current().nextInt(100) <= main.getConfig().getInt("Emerald")) {
                if (main.emeraldtoggle == true) {
                    player.getInventory().addItem(emeraldIS);
                }
            }
        }
    }
}
