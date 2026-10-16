package space.ashalinux.aMinecraftPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class AMinecraftPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JumpListener(), this);
        System.out.println("§4Plugin ist da.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
