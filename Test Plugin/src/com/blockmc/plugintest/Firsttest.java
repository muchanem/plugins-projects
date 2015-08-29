package com.blockmc.plugintest;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Firsttest extends JavaPlugin{
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		logger.info(pdfFile.getName() + "has been inabled (V." + pdfFile.getVersion());
	}
	
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		logger.info(pdfFile.getName() + "has been disabled (V." + pdfFile.getVersion());
	}
}
