package com.github.white555gamer.namere.assets.NameRE_assets.NameE;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;

public class edit_custom {

    public static void EditCustom(CommandSender sender, Player player, String[] args) {

        player.setCustomName(args[2]);
        sender.sendMessage(GREEN + "COMMAND SUCCEEDED: " + args[1] + "\'s custom name was changed to " + args[2] + ".");
        player.sendMessage("Custom name was changed to " + args[2] + " by " + sender.getName() + ".");
        return;

    }
}
