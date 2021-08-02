package wantairan.wan117.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class change implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Plugin config=wantairan.wan117.Wan117.getProvidingPlugin(wantairan.wan117.Wan117.class);
        if(args.length==0){
            sender.sendMessage("你输入了改变配置文件的指令");
        }else if(args.length==2){
            if(args[0].equals("string")) {
                config.getConfig().set("string", args[1]);
            }else if(args[0].equals("int")){
                config.getConfig().set("int",args[1]);
            }else if(args[0].equals("list")){
                List<String> list=config.getConfig().getStringList("list");
                list.add(args[1]);
                config.getConfig().set("list",list);
            }
        }else if(args.length==1){
            sender.sendMessage("你还没输入修改后的参数");
        }else{
            sender.sendMessage("输入语法错误");
        }
        config.saveConfig();
        config.reloadConfig();
        return false;
    }
}
