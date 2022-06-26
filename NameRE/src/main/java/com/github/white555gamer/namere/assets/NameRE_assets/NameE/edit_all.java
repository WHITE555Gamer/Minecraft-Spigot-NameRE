package com.github.white555gamer.namere.assets.NameRE_assets.NameE;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;

public class edit_all {

    public static void EditAll(CommandSender sender, Player player, String[] args) {

        player.setCustomName(args[2]);
        player.setDisplayName(args[2]);
        player.setPlayerListName(args[2]);
        sender.sendMessage(GREEN + "COMMAND SUCCEEDED: " + args[1] + "\'s name was changed to " + args[2] + ".");
        player.sendMessage("Name was changed to " + args[2] + " by " + sender.getName() + ".");
        return;

    }
}
