package com.github.white555gamer.namere.assets.NameRE_assets.NameR;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;

public class reset_all {

    public static void ResetAll(CommandSender sender, Player player, String[] args) {

        player.setCustomName(player.getName());
        player.setDisplayName(player.getName());
        player.setPlayerListName(player.getName());
        sender.sendMessage(GREEN + "COMMAND SUCCEEDED: " + args[1] + "\'s name was reset.");
        player.sendMessage("Name was reset by " + sender.getName() + ".");

    }
}
