package hdr;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ascii extends JavaPlugin{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("shrug")) {
            Player player = (Player) sender;
            player.chat("\u00AF\\\u005F\u0028\u30C4\u0029\u005F\u002F\u00AF");
        }
        if (cmd.getName().equalsIgnoreCase("flip")) {
            Player player = (Player) sender;
            player.chat("\u0028\u256F\u00B0\u25A1\u00B0\uFF09\u256F\uFE35 \u253B\u2501\u253B");
        }
        if (cmd.getName().equalsIgnoreCase("unflip")) {
            Player player = (Player) sender;
            player.chat("\u252C\u2500\u252C \u30CE\u0028 \u309C\u2212\u309C\u30CE\u0029");
        }
        if (cmd.getName().equalsIgnoreCase("disapprove")) {
            Player player = (Player) sender;
            player.chat("\u0CA0\u005F\u0CA0");
        }
        if (cmd.getName().equalsIgnoreCase("angry")) {
            Player player = (Player) sender;
            player.chat("\u0028\u256C \u0CA0\u76CA\u0CA0\u0029");
        }
        if (cmd.getName().equalsIgnoreCase("ameno")) {
            Player player = (Player) sender;
            player.chat("\u0F3C \u3064 \u25D5\u005F\u25D5 \u0F3D\u3064");
        }
        if (cmd.getName().equalsIgnoreCase("riot")) {
            Player player = (Player) sender;
            player.chat("\u0B67\u0F3C\u0CA0\u76CA\u0CA0\u0F3D\u0B68");
        }
        if (cmd.getName().equalsIgnoreCase("csi")) {
            Player player = (Player) sender;
            player.chat("\u0028\u2022\u005F\u2022\u0029 \u0028 \u2022\u005F \u2022\u0029\u003E\u2310\u25A0\u005F\u25A0 \u0028\u2310\u25A0\u005F\u25A0\u0029");
        }
        return false;
    }

}
