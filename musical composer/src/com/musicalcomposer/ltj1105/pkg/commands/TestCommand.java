package com.musicalcomposer.ltj1105.pkg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.musicalcomposer.ltj1105.pkg.Main;
import com.musicalcomposer.ltj1105.pkg.ui.TestUI;

public class TestCommand implements CommandExecutor{
	
	private Main plugin;
	
	public TestCommand (Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("test").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		if(!(sender instanceof Player)) {
			//send console a message sender.sendMessage();
			
			return true;
		}
		
		Player p = (Player) sender;
		
		if(p.isOp()) {
			p.openInventory(TestUI.GUI(p));
		}
		return false;
	}

}