package com.musicalcomposer.ltj1105.pkg.ui;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.musicalcomposer.ltj1105.pkg.Utils.Utils;

public class TestUI {
	
	public static Inventory inv;
	public static String inventory_name;
	public static int inv_rows = 6 * 9;

	public static void initialize() {
		inventory_name = Utils.chat("&6music");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	public static Inventory GUI (Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		List<String> s = Arrays.asList("");
		
		Utils.createItem(inv, 34, 1, 1, "", s);
		Utils.createItem(inv, 34, 1, 9, "", s);			//첫쨰줄
		Utils.createItem(inv, 34, 1, 10, "", s);
		Utils.createItem(inv, 386, 1, 12, "&6악보만들기", Arrays.asList(ChatColor.GRAY + "새로운 악보만들기",ChatColor.GREEN +"<클릭하기>"));
		Utils.createItem(inv, 25, 1, 14, "&f불러오기", Arrays.asList(ChatColor.GREEN +"<클릭하기>"));
		Utils.createItem(inv, 2256, 1, 16, "&b재생하기", Arrays.asList(ChatColor.GREEN + "<클릭하기>"));
		Utils.createItem(inv, 34, 1, 18, "", s);		//둘째줄
		Utils.createItem(inv, 34, 1, 19, "", s);
		Utils.createItem(inv, 34, 1, 27, "", s);		//셋쨰줄
		Utils.createItem(inv, 34, 1, 28, "", s);
		Utils.createItem(inv, 123, 1, 31, "&c<->", Arrays.asList(ChatColor.GREEN + "<클릭하기>"));
		Utils.createItem(inv, 323, 1, 32, "&a[?]", Arrays.asList(ChatColor.BLUE + "속도 조절", ChatColor.GREEN +"<클릭하기>"));
		Utils.createItem(inv, 123, 1, 33, "&b<+>", Arrays.asList(ChatColor.GREEN +"<클릭하기>"));
		Utils.createItem(inv, 34, 1, 36, "", s);
		Utils.createItem(inv, 34, 1, 37, "", s);
		Utils.createItem(inv, 34, 1, 45, "", s);		//넷쨰줄
		Utils.createItem(inv, 34, 1, 46, "", s);
		Utils.createItem(inv, 54, 1, 48, "&9앨범", Arrays.asList(ChatColor.BLUE + "앨범 열기",ChatColor.GREEN + "<클릭하기>"));
		Utils.createItem(inv, 324, 1, 50, "&d&n망할 음악(Sheet music)", Arrays.asList(ChatColor.GREEN + "<클릭하기>"));
		Utils.createItem(inv, 130, 1, 52, "&8[???]", Arrays.asList(ChatColor.GRAY + "[coming soon]", ChatColor.RED + "<클릭하기>"));
		Utils.createItem(inv, 34, 1, 54, "", s);
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void  clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cTest Item"))) {
			p.sendMessage(Utils.chat("&8[&6*&8] &6넌 GUI를 만드는데 성공했어"));
		}
	}
}