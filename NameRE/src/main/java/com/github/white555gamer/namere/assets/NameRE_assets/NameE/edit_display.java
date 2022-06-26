package com.github.white555gamer.namere.assets.NameRE_assets.NameE;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;

public class edit_display {

    public static void EditDisplay(CommandSender sender, Player player, String[] args) {

        player.setDisplayName(args[2]);
        sender.sendMessage(GREEN + "COMMAND SUCCEEDED: " + args[1] + "\'s display name was changed to " + args[2] + ".");
        player.sendMessage("Display name was changed to " + args[2] + " by " + sender.getName() + ".");
        return;

    }
}
