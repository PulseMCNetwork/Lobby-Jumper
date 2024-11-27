package br.com.pulsemc.minecraft.lobbyjumper.slimedash;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class SlimeDashListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (event.getPlayer().getLocation().subtract(0,1,0).getBlock().getType() == Material.SLIME_BLOCK ) {
            Vector direction = event.getPlayer().getEyeLocation().getDirection();
            direction.setY(1);
            direction.multiply(2);
            event.getPlayer().setVelocity(direction);
        }

    }

}
