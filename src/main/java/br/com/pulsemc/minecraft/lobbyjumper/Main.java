package br.com.pulsemc.minecraft.lobbyjumper;

import br.com.pulsemc.minecraft.lobbyjumper.slimedash.SlimeDashListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new SlimeDashListener(),this);
        Bukkit.getConsoleSender().sendMessage("SlimeDash by Mike is active!");
        Bukkit.getPluginManager().registerEvents(new br.com.pulsemc.minecraft.lobbyjumper.trampoline.TrampolineListener(), this);
        Bukkit.getConsoleSender().sendMessage("Trampoline by Mike is active!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
