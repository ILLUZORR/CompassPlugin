package me.illuzorr.plugin.gateplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Array;

public final class GatePlugin extends JavaPlugin {

    @Override
    public void onEnable() {


    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equals("heck")) {
            if(sender instanceof Player player) {
                String food = getConfig().getString("items");
                player.sendMessage(food + " " + "player");
                getServer().broadcastMessage(food + " " + "server");

            }
        }
        return true;
    }

    @Override
    public void onDisable() {


    }
}
