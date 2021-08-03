package wantairan.wan117;

import org.bukkit.plugin.java.JavaPlugin;
import wantairan.wan117.commands.*;
import wantairan.wan117.events.fish;
public final class Wan117 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("波动率微笑的API已加载");
        getCommand("hello").setExecutor(new one());
        getCommand("hello").setTabCompleter(new one());
        getCommand("add").setExecutor(new add());
        getCommand("gonggao").setExecutor(new gonggao());
        getCommand("config").setExecutor(new config());
        getCommand("change").setExecutor(new change());
        getCommand("health").setExecutor(new health());
        getServer().getPluginManager().registerEvents(new fish(),this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("波动率微笑的API已卸载");
        System.out.println("哈哈哈哈你怎么又");
    }
}
