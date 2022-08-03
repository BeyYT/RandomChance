package com.beyyt.randomchance;

import java.util.ArrayList;

import org.bukkit.Material;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

// enchantment import
// import org.bukkit.enchantments.Enchantment;

// colored text import 
// import org.bukkit.ChatColor;

// Mob imports
// change {mob} with mob name
// import org.bukkit.entity.{mob};
public class Func {
	public void test(Entity killer) {

		// Gets Player Inventory
		PlayerInventory inventory = ((Player) killer).getInventory();
			  
		// Creates Item and gets item meta.

		// to change the item, use "Material.ITEM/BLOCK_NAME_IN_CAPS"
		ItemStack item = new ItemStack(Material.GRASS_BLOCK);
		ItemMeta item_meta = item.getItemMeta();
			  
		// sets display name of item
		item_meta.setDisplayName("Change Item Name, Also You Can Use Colored / Bolded / Italic / Underlined Text with ChatColor.");
			  
		// you can add any enchantment you want.
		// just uncomment the line below.
		
		// item_meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			  
		// lore list (secretly string list)
		ArrayList<String> loreList = new ArrayList<String>();
			  
		// Actual Lore
		// To Add lore, do loreList.add("String Goes Here");
		loreList.add("");
			
			  
		// Sets item Lore and meta to the item
		item_meta.setLore(loreList);
		item.setItemMeta(item_meta);
			  
		// Adds item to inventory.
		inventory.addItem(item);
	}
	
}
	
	
	

