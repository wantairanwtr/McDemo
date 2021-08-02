package wantairan.wan117.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class fish implements Listener {
    @EventHandler
    public void PlayerFishEvent(PlayerFishEvent fish){
        fish.getPlayer().sendMessage(ChatColor.YELLOW+"我看到"+ChatColor.GREEN+"你扔出来了鱼竿");
        fish.setCancelled(true);
        fish.getPlayer().sendMessage("服主收起了你的鱼竿并向你扔了一条狗");
    }
}
