package hdr;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class shrug extends JavaPlugin{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("shrug")) {
            Player player = (Player) sender;
            player.chat("\u00AF\\\u005F\u0028\u30C4\u0029\u005F\u002F\u00AF");
            return true;
        }
        return false;
    }

}
