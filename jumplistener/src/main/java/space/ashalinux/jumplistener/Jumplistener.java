package space.ashalinux.jumplistener;

import org.bukkit.plugin.java.JavaPlugin;

public final class Jumplistener extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
