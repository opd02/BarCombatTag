package me.opd02.barcombattag;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class BarCombatTag extends JavaPlugin implements Listener {
	
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable(){
		
	}
	
}
