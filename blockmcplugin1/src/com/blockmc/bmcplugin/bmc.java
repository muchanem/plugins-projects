package com.blockmc.bmcplugin;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.blockmc.bmcplugin.commands.Hello;
import com.blockmc.bmcplugin.commands.rtp;

public class bmc extends JavaPlugin {
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		getCommand("hello").setExecutor(new Hello());
		getCommand("rtp").setExecutor(new rtp());
		
		logger.info(pdfFile.getName() + "has been inabled (V." + pdfFile.getVersion());
	}
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + "has been disabled (V." + pdfFile.getVersion());
	}
	

	
}
