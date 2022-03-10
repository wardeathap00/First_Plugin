package ace.pesia.firstplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ace.pesia.firstplugin.Main;

public class HelloCommand implements CommandExecutor{
	private Main plugin;
	
	public HelloCommand(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] arg3) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("player send message");
			return true;
		}
	return false;
	}
}
