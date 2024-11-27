package br.com.pulsemc.minecraft.lobbyjumper.slimedash;

import br.com.pulsemc.minecraft.lobbyjumper.Main;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class SlimeDashListener implements Listener {

    private final Main plugin;

    public SlimeDashListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (event.getPlayer().getLocation().subtract(0,1,0).getBlock().getType() == Material.SLIME_BLOCK ) {
            Vector direction = event.getPlayer().getEyeLocation().getDirection();
            direction.setY(plugin.getConfig().getInt("slimedash.y", 1));
            direction.multiply(plugin.getConfig().getInt("slimedash.multiply", 2));
            event.getPlayer().setVelocity(direction);
        }
    }
}
