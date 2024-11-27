package br.com.pulsemc.minecraft.lobbyjumper.trampoline;

import br.com.pulsemc.minecraft.lobbyjumper.Main;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class TrampolineListener implements Listener {

    private final Main plugin;

    public TrampolineListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Block block = event.getPlayer().getLocation().subtract(0,1,0).getBlock();
        boolean isBlock = (block.getType() == Material.WOOL && block.getData() == (byte) 15);

        if (isBlock){
            event.getPlayer().setVelocity(new Vector(0,
                    plugin.getConfig().getDouble("trampoline.y", 1.5),
                    0));
        }
    }
}
