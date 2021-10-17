package me.illuzorr.plugin.gateplugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public final class CompassPlugin extends JavaPlugin {

    private boolean compas = false;
    @Override
    public void onEnable() {


    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equals("compass")) {
            if (sender instanceof Player player) {
                Player target = Bukkit.getPlayerExact(args[0]);
                compas = !compas;
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        if(compas && target != null) {
                            player.setCompassTarget(target.getLocation());
                        }
                    }
                }.runTaskTimer(this, 0, 1L);
            }
        }
        return true;
    }

    @Override
    public void onDisable() {


    }
}
