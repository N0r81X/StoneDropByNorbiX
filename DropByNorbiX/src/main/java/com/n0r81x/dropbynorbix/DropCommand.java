package com.n0r81x.dropbynorbix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DropCommand implements CommandExecutor {
    private Main main;
    public DropCommand(Main main){this.main = main;}
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            Inventory inventory = Bukkit.createInventory(new DropHolder(), 54, main.getConfig().getString("InventoryDropMenuName"));

            //COAL
            inventory.setItem(20, main.coalIS);
            //IRON
            inventory.setItem(21, main.ironIS);
            //GOLD
            inventory.setItem(22, main.goldIS);
            //DIAMOND
            inventory.setItem(23, main.diamondIS);
            //EMERALD
            inventory.setItem(24, main.emeraldIS);

            //FRAME
            ItemStack frameIS = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
            ItemMeta frameMeta = frameIS.getItemMeta();
            frameMeta.setDisplayName(" ");
            frameIS.setItemMeta(frameMeta);
            for (int i : new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,25,26,27,28,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53}){
                inventory.setItem(i, frameIS);
            }
            player.openInventory(inventory);
        }
        return false;
    }
}
