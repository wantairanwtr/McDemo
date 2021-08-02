package wantairan.wan117.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class add implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int a1=3,b1=4;
        double a2=1.1,b2=1.2;
        char a3='a',b3='b';
        String a4="你好",b4="旧时光";
        sender.sendMessage(a1+b1+"");
        sender.sendMessage(a2+b2+"");
        sender.sendMessage(a3+b3+"");
        sender.sendMessage(a4+b4);
        return false;
    }
}
