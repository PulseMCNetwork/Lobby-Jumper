package br.com.pulsemc.minecraft.lobbyjumper;

import br.com.pulsemc.minecraft.lobbyjumper.slimedash.SlimeDashListener;
import br.com.pulsemc.minecraft.lobbyjumper.trampoline.TrampolineListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("███    ███ ██ ██   ██ ███████");
        Bukkit.getConsoleSender().sendMessage("████  ████ ██ ██  ██  ██     ");
        Bukkit.getConsoleSender().sendMessage("██ ████ ██ ██ █████   █████  ");
        Bukkit.getConsoleSender().sendMessage("██  ██  ██ ██ ██  ██  ██     ");
        Bukkit.getConsoleSender().sendMessage("██      ██ ██ ██   ██ ███████");
        Bukkit.getConsoleSender().sendMessage(" ");

        Bukkit.getPluginManager().registerEvents(new SlimeDashListener(this),this);
        Bukkit.getConsoleSender().sendMessage("SlimeDash by Mike is active!");

        Bukkit.getPluginManager().registerEvents(new TrampolineListener(this), this);
        Bukkit.getConsoleSender().sendMessage("Trampoline by Mike is active!!");
    }
}
