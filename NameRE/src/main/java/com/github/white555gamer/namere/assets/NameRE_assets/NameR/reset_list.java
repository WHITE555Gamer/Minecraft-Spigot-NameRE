package com.github.white555gamer.namere.assets.NameRE_assets.NameR;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;

public class reset_list {

    public static void ResetList(CommandSender sender, Player player, String[] args) {

        player.setPlayerListName(player.getName());
        sender.sendMessage(GREEN + "COMMAND SUCCEEDED: " + args[1] + "\'s list name was reset.");
        player.sendMessage("List name was reset by " + sender.getName() + ".");
        return;

    }
}
