package hdr.commands;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;

public class AmenoCMD implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        if (src instanceof Player) {
            ((Player) src).simulateChat(Text.builder("\u0F3C \u3064 \u25D5\u005F\u25D5 \u0F3D\u3064").build(), Sponge.getCauseStackManager().getCurrentCause());
        }
        return CommandResult.success();
    }
}