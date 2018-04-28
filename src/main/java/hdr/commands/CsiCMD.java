package hdr.commands;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;

public class CsiCMD implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        if (src instanceof Player) {
            ((Player) src).simulateChat(Text.builder("\u0028\u2022\u005F\u2022\u0029 \u0028 \u2022\u005F \u2022\u0029\u003E\u2310\u25A0\u005F\u25A0 \u0028\u2310\u25A0\u005F\u25A0\u0029").build(), Sponge.getCauseStackManager().getCurrentCause());
        }
        return CommandResult.success();
    }
}