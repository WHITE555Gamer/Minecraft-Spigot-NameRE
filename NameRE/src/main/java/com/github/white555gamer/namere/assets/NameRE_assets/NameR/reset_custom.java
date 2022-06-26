package com.github.white555gamer.namere.assets.NameRE_assets.NameR;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;

public class reset_custom {

    public static void ResetCustom(CommandSender sender, Player player, String[] args) {

        player.setCustomName(player.getName());
        sender.sendMessage(GREEN + "COMMAND SUCCEEDED: " + args[1] + "\'s custom name was reset.");
        player.sendMessage("Custom name was reset by " + sender.getName() + ".");
        return;

    }
}
