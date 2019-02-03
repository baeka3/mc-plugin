package com.musicalcomposer.ltj1105.pkg;

import org.bukkit.plugin.java.JavaPlugin;

import com.musicalcomposer.ltj1105.pkg.commands.TestCommand;
import com.musicalcomposer.ltj1105.pkg.listeners.InventoryClickListener;
import com.musicalcomposer.ltj1105.pkg.ui.TestUI;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new TestCommand(this);
		new InventoryClickListener(this);
		TestUI.initialize();
		
	}

}