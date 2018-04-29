package hdr;


import hdr.commands.*;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;

public class ascii {

    private void makeCommands() {
        Sponge.getCommandManager().register(this, ShrugCMD, "shrug");
        Sponge.getCommandManager().register(this, FlipCMD, "flip");
        Sponge.getCommandManager().register(this, UnflipCMD, "unflip");
        Sponge.getCommandManager().register(this, DisapproveCMD, "disapprove");
        Sponge.getCommandManager().register(this, AngryCMD, "angry");
        Sponge.getCommandManager().register(this, AmenoCMD, "ameno");
        Sponge.getCommandManager().register(this, RiotCMD, "riot");
        Sponge.getCommandManager().register(this, CsiCMD, "csi");
    }

    private static CommandSpec ShrugCMD = CommandSpec.builder().description(Text.of("Shrug")).permission("ascii.shrug").executor(new ShrugCMD()).build();
    private static CommandSpec FlipCMD = CommandSpec.builder().description(Text.of("Flip")).permission("ascii.flip").executor(new FlipCMD()).build();
    private static CommandSpec UnflipCMD = CommandSpec.builder().description(Text.of("Unflip")).permission("ascii.unflip").executor(new UnflipCMD()).build();
    private static CommandSpec DisapproveCMD = CommandSpec.builder().description(Text.of("Disapprove")).permission("ascii.disapprove").executor(new DisapproveCMD()).build();
    private static CommandSpec AngryCMD = CommandSpec.builder().description(Text.of("Angry")).permission("ascii.angry").executor(new AngryCMD()).build();
    private static CommandSpec AmenoCMD = CommandSpec.builder().description(Text.of("Ameno")).permission("ascii.ameno").executor(new AmenoCMD()).build();
    private static CommandSpec RiotCMD = CommandSpec.builder().description(Text.of("Riot")).permission("ascii.riot").executor(new RiotCMD()).build();
    private static CommandSpec CsiCMD = CommandSpec.builder().description(Text.of("CSI")).permission("ascii.csi").executor(new CsiCMD()).build();


    @Listener
    public void onInit(GameStartedServerEvent e) {
        makeCommands();
    }
}
