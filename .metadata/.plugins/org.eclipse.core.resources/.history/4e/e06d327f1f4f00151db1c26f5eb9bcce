package com.blockmc.bmcplugin;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class bmc extends JavaPlugin {
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + "has been inabled (V." + pdfFile.getVersion());
	}
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + "has been disabled (V." + pdfFile.getVersion());
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("hello")) {
			
			if (!(sender instanceof Player)) {
				sender.sendMessage("You Must Be Player To Use This Command");
				return false;
			}
			
			Player player = (Player) sender;
			player.sendMessage(ChatColor.GOLD + "Hello" + player.getName() + "!" );

			return true;

		}
		return false;
	}
	
}
