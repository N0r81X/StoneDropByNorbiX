package com.n0r81x.dropbynorbix;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.Arrays;

public class InventoryEvent implements Listener {
    private Main main;
    public InventoryEvent(Main main){this.main = main;}
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        if (e.getInventory().getHolder() instanceof DropHolder) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            Location location = player.getLocation();
            Inventory inventory = e.getInventory();
            switch (e.getRawSlot()) {
                case 20:
                    if(main.coaltoggle == false) {
                        main.coaltoggle = true;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.coalString = "§2ENABLED";
                        main.coalMeta.setLore(Arrays.asList(main.coalString));
                        main.coalIS.setItemMeta(main.coalMeta);
                        inventory.setItem(e.getSlot(), main.coalIS);
                    } else {
                        main.coaltoggle = false;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.coalString = "§4DISABLED";
                        main.coalMeta.setLore(Arrays.asList(main.coalString));
                        main.coalIS.setItemMeta(main.coalMeta);
                        inventory.setItem(e.getSlot(), main.coalIS);
                    }
                    break;
                case 21:
                    if (main.irontoggle == false) {
                        main.irontoggle = true;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.ironString = "§2ENABLED";
                        main.ironMeta.setLore(Arrays.asList(main.ironString));
                        main.ironIS.setItemMeta(main.ironMeta);
                        inventory.setItem(e.getSlot(), main.ironIS);
                    } else {
                        main.irontoggle = false;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.ironString = "§4DISABLED";
                        main.ironMeta.setLore(Arrays.asList(main.ironString));
                        main.ironIS.setItemMeta(main.ironMeta);
                        inventory.setItem(e.getSlot(), main.ironIS);
                    }
                    break;
                case 22:
                    if (main.goldtoggle == false) {
                        main.goldtoggle = true;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.goldString = "§2ENABLED";
                        main.goldMeta.setLore(Arrays.asList(main.goldString));
                        main.goldIS.setItemMeta(main.goldMeta);
                        inventory.setItem(e.getSlot(), main.goldIS);
                    } else {
                        main.goldtoggle = false;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.goldString = "§4DISABLED";
                        main.goldMeta.setLore(Arrays.asList(main.goldString));
                        main.goldIS.setItemMeta(main.goldMeta);
                        inventory.setItem(e.getSlot(), main.goldIS);
                    }
                    break;
                case 23:
                    if (main.diamondtoggle == false) {
                        main.diamondtoggle = true;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.diamondString = "§2ENABLED";
                        main.diamondMeta.setLore(Arrays.asList(main.diamondString));
                        main.diamondIS.setItemMeta(main.diamondMeta);
                        inventory.setItem(e.getSlot(), main.diamondIS);
                    } else {
                        main.diamondtoggle = false;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.diamondString = "§4DISABLED";
                        main.diamondMeta.setLore(Arrays.asList(main.diamondString));
                        main.diamondIS.setItemMeta(main.diamondMeta);
                        inventory.setItem(e.getSlot(), main.diamondIS);
                    }
                    break;
                case 24:
                    if (main.emeraldtoggle == false) {
                        main.emeraldtoggle = true;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.emeraldString = "§2ENABLED";
                        main.emeraldMeta.setLore(Arrays.asList(main.emeraldString));
                        main.emeraldIS.setItemMeta(main.emeraldMeta);
                        inventory.setItem(e.getSlot(), main.emeraldIS);
                    } else {
                        main.emeraldtoggle = false;
                        ((Player) e.getWhoClicked()).playSound(location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 100);
                        main.emeraldString = "§4DISABLED";
                        main.emeraldMeta.setLore(Arrays.asList(main.emeraldString));
                        main.emeraldIS.setItemMeta(main.emeraldMeta);
                        inventory.setItem(e.getSlot(), main.emeraldIS);
                    }
                    break;
            }
        }
    }
}
