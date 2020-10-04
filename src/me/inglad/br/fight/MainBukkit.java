package me.inglad.br.fight;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class MainBukkit extends JavaPlugin {
	
	@Override
	public void onEnable() {
		super.onEnable();
		Bukkit.getLogger().info("------------------");
		Bukkit.getLogger().info("IngFight started!");
		Bukkit.getLogger().info("------------------");
	}
	
	
	@Override
	public void onDisable() {
		super.onDisable();
		Bukkit.getLogger().info("------------------");
		Bukkit.getLogger().info("IngFight disabled!");
		Bukkit.getLogger().info("------------------");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		CommandTreater.EvalCommand(sender, command, label, args);
		return super.onCommand(sender, command, label, args);
	}
}
