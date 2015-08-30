package com.blockmc.bmcplugin.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class rtp implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You Must Be Player To Use This Command");
			return false;
		}

		Player player = (Player) sender;

		Location l = new Location(player.getWorld(), 0, 64, 0);
		player.sendMessage(ChatColor.RED + "You Got Tp'd to 0 64 0");
		player.teleport(l);
		return true;
	}

}
