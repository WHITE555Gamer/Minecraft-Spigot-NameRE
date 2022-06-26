package com.github.white555gamer.namere.assets.NameRE_assets.NameR;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;

public class reset_display {

    public static void ResetDisplay(CommandSender sender, Player player, String[] args) {

        player.setDisplayName(player.getName());
        sender.sendMessage(GREEN + "COMMAND SUCCEEDED: " + args[1] + "\'s display name was reset.");
        player.sendMessage("Display name was reset by " + sender.getName() + ".");
        return;

    }
}
