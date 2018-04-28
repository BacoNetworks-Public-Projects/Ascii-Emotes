package hdr.commands;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;

public class ShrugCMD implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        if (src instanceof Player) {
            ((Player) src).simulateChat(Text.builder("\u00AF\\\u005F\u0028\u30C4\u0029\u005F\u002F\u00AF").build(), Sponge.getCauseStackManager().getCurrentCause());
        }
        return CommandResult.success();
    }
}