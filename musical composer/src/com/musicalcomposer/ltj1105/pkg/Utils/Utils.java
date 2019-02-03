package com.musicalcomposer.ltj1105.pkg.Utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Utils {
	
	public static String chat(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);	
	}
	public static ItemStack createItem(Inventory inv, int materialId, int amount,int invSlot, 
						String displayName, List<String> loreString) {
		
		ItemStack item;
		List<String> lore = new ArrayList<String>(); //문제
		item = new ItemStack(Material.getMaterial(materialId), amount);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		for (String s : loreString) {
			lore.add(Utils.chat(s));
			meta.setLore(loreString); //for each에  setLore() 코드 추가
		}
		meta.getLore();
		item.setItemMeta(meta);
		inv.setItem(invSlot -1, item);
		
		return item;
	}
	public static ItemStack createItemByte(Inventory inv, int materialId, int byteId, int amount,int invSlot, 
				String displayName, List<String> loreString) {
		
		ItemStack item;
		List<String> lore = new ArrayList<String>(); //ArrayList()
		
		item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);
		
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		for (String s : loreString) {
			lore.add(Utils.chat(s));
		}
		meta.getLore();
		item.setItemMeta(meta);
		inv.setItem(invSlot -1, item);
		
		return item;
	}

}