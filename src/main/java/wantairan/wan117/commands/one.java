package wantairan.wan117.commands;
import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class one implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==0){
            sender.sendMessage(ChatColor.YELLOW+"欢迎使用波动率微笑的API,"+ChatColor.GREEN+"你刚输入了基础指令");
        }else if(args.length==1){
            String ast = args[0];
            sender.sendMessage("你输入了:"+ast);
            if(ast.equals("服务器名")){
                sender.sendMessage("波动率微笑的服务器");
            }else if(ast.equals("服务器IP")){
                sender.sendMessage("wantairan.top:8888");
            }
            }else{
            sender.sendMessage("输入错误");
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(args.length==1){
            List<String> list = new ArrayList<>();
            list.add("服务器名");
            list.add("服务器IP");
            return list;
        }
        return null;
    }
}
