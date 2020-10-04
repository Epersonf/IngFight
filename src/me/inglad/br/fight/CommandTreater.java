package me.inglad.br.fight;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTreater {
	public static void EvalCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = getPlayer(sender);
		boolean hasPermission = hasPermission(sender);
		
		if (!command.getLabel().equalsIgnoreCase("fight")) return;
		
		
	}
	
	public static boolean hasPermission(CommandSender sender) {
		if (!(sender instanceof Player)) return true;
		if (((Player) sender).hasPermission("fight.admin")) return true;
		return false;
	}
	
	public static Player getPlayer(CommandSender sender) {
		if (!(sender instanceof Player)) return null;
		return (Player) sender;
	}
	
	public static void sendMessage(Player p, String msg) {
		if (p != null)
			p.sendMessage(msg);
		else
			Bukkit.getLogger().info(msg);
	}
}
