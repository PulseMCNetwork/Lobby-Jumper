package br.com.pulsemc.minecraft.lobbyjumper.trampoline;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class TrampolineListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Block block = event.getPlayer().getLocation().subtract(0,1,0).getBlock();
        boolean isNigger = (block.getType() == Material.WOOL && block.getData() == (byte) 15);

        if (isNigger){
            event.getPlayer().setVelocity(new Vector(0,1.5,0));
        }

    }

}
