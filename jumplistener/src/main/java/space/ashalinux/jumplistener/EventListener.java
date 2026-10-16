package space.ashalinux.jumplistener;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EventListener implements Listener {

    @EventHandler
    public void onJump(PlayerJumpEvent event) {
        event.getPlayer().sendMessage("Du bist gesprungen!");
    }
}