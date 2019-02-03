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
		Utils.createItem(inv, 34, 1, 9, "", s);			//ù����
		Utils.createItem(inv, 34, 1, 10, "", s);
		Utils.createItem(inv, 386, 1, 12, "&6�Ǻ������", Arrays.asList(ChatColor.GRAY + "���ο� �Ǻ������",ChatColor.GREEN +"<Ŭ���ϱ�>"));
		Utils.createItem(inv, 25, 1, 14, "&f�ҷ�����", Arrays.asList(ChatColor.GREEN +"<Ŭ���ϱ�>"));
		Utils.createItem(inv, 2256, 1, 16, "&b����ϱ�", Arrays.asList(ChatColor.GREEN + "<Ŭ���ϱ�>"));
		Utils.createItem(inv, 34, 1, 18, "", s);		//��°��
		Utils.createItem(inv, 34, 1, 19, "", s);
		Utils.createItem(inv, 34, 1, 27, "", s);		//�¤���
		Utils.createItem(inv, 34, 1, 28, "", s);
		Utils.createItem(inv, 123, 1, 31, "&c<->", Arrays.asList(ChatColor.GREEN + "<Ŭ���ϱ�>"));
		Utils.createItem(inv, 323, 1, 32, "&a[?]", Arrays.asList(ChatColor.BLUE + "�ӵ� ����", ChatColor.GREEN +"<Ŭ���ϱ�>"));
		Utils.createItem(inv, 123, 1, 33, "&b<+>", Arrays.asList(ChatColor.GREEN +"<Ŭ���ϱ�>"));
		Utils.createItem(inv, 34, 1, 36, "", s);
		Utils.createItem(inv, 34, 1, 37, "", s);
		Utils.createItem(inv, 34, 1, 45, "", s);		//�ݤ���
		Utils.createItem(inv, 34, 1, 46, "", s);
		Utils.createItem(inv, 54, 1, 48, "&9�ٹ�", Arrays.asList(ChatColor.BLUE + "�ٹ� ����",ChatColor.GREEN + "<Ŭ���ϱ�>"));
		Utils.createItem(inv, 324, 1, 50, "&d&n���� ����(Sheet music)", Arrays.asList(ChatColor.GREEN + "<Ŭ���ϱ�>"));
		Utils.createItem(inv, 130, 1, 52, "&8[???]", Arrays.asList(ChatColor.GRAY + "[coming soon]", ChatColor.RED + "<Ŭ���ϱ�>"));
		Utils.createItem(inv, 34, 1, 54, "", s);
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void  clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cTest Item"))) {
			p.sendMessage(Utils.chat("&8[&6*&8] &6�� GUI�� ����µ� �����߾�"));
		}
	}
}