package hdr;


import hdr.commands.ShrugCMD;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;

@Plugin(id = "shrug", name = "Shrug")
public class shrug {

    private void makeCommands() {
        Sponge.getCommandManager().register(this, ShrugCMD, "shrug");
    }

    private static CommandSpec ShrugCMD = CommandSpec.builder().description(Text.of("Shrug")).permission("hdr.shrug").executor(new ShrugCMD()).build();

    @Listener
    public void onInit(GameStartedServerEvent e) {
        makeCommands();
    }
}
