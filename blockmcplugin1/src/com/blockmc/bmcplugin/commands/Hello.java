package com.blockmc.bmcplugin.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hello implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage("You Must Be Player To Use This Command");
			return false;
		}

		Player player = (Player) sender;
		player.sendMessage(ChatColor.GOLD + "Hello" + player.getName() + "!");

		return true;

	}

}

