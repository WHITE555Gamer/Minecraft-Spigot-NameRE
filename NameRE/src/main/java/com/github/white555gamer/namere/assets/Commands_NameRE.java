package com.github.white555gamer.namere.assets;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.github.white555gamer.namere.assets.ErrorMsg.*;
import static com.github.white555gamer.namere.assets.NameRE_assets.NameE.edit_all.EditAll;
import static com.github.white555gamer.namere.assets.NameRE_assets.NameE.edit_custom.EditCustom;
import static com.github.white555gamer.namere.assets.NameRE_assets.NameE.edit_display.EditDisplay;
import static com.github.white555gamer.namere.assets.NameRE_assets.NameE.edit_list.EditList;
import static com.github.white555gamer.namere.assets.NameRE_assets.NameR.reset_all.ResetAll;
import static com.github.white555gamer.namere.assets.NameRE_assets.NameR.reset_custom.ResetCustom;
import static com.github.white555gamer.namere.assets.NameRE_assets.NameR.reset_display.ResetDisplay;
import static com.github.white555gamer.namere.assets.NameRE_assets.NameR.reset_list.ResetList;
import static com.github.white555gamer.namere.assets.NameRE_assets.version.VersionMessage;
import static org.bukkit.Bukkit.*;

public class Commands_NameRE implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args[0].equalsIgnoreCase("version")) {
            sender.sendMessage(VersionMessage());return true;
        }

        if (sender.isOp()){
            Player player = getPlayer(args[1]);
            if (player == null) {
                sender.sendMessage(PlayerNotFound(args));return true;
            } else {
                if (args.length == 3) {
                    if (args[0].equalsIgnoreCase("edit-custom")) {
                        EditCustom(sender, player, args);return true;
                    } else if (args[0].equalsIgnoreCase("edit-display")) {
                        EditDisplay(sender, player, args);return true;
                    } else if (args[0].equalsIgnoreCase("edit-list")) {
                        EditList(sender, player, args);return true;
                    } else if (args[0].equalsIgnoreCase("edit-all")) {
                        EditAll(sender, player, args);return true;
                    } else if (args[0].equalsIgnoreCase("reset-custom")) {
                        ResetCustom(sender, player, args);return true;
                    } else if (args[0].equalsIgnoreCase("reset-display")) {
                        ResetDisplay(sender, player, args);return true;
                    } else if (args[0].equalsIgnoreCase("reset-list")) {
                        ResetList(sender, player, args);return true;
                    } else if (args[0].equalsIgnoreCase("reset-all")) {
                        ResetAll(sender, player, args);return true;
                    } else {
                        sender.sendMessage(UnidentifiedCommand);return true;
                    }
                } else {
                    sender.sendMessage(InsufficientCommand);return true;
                }
            }
        } else {
            sender.sendMessage(OpPermissionRequired);
            getLogger().info(sender.getName() + " issued NameRE Command:\n" + label);
            return true;
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("NameRE")) {
            if (args.length == 1) {
                if (args[0].length() == 0) {
                    return Arrays.asList("edit-all","edit-custom","edit-display","edit-list","reset-all","reset-custom","reset-display","reset-list");
                } else {
                    if ("edit-".startsWith(args[0])) {
                        return Arrays.asList("edit-all","edit-custom","edit-display","edit-list");
                    } else if ("edit-all".startsWith(args[0])) {
                        return Collections.singletonList("edit-all");
                    } else if ("edit-custom".startsWith(args[0])) {
                        return Collections.singletonList("edit-custom");
                    } else if ("edit-display".startsWith(args[0])) {
                        return Collections.singletonList("edit-display");
                    } else if ("edit-list".startsWith(args[0])) {
                        return Collections.singletonList("edit-list");
                    } else if ("reset-".startsWith(args[0])) {
                        return Arrays.asList("reset-all","reset-custom","reset-display","reset-list");
                    } else if ("reset-all".startsWith(args[0])) {
                        return Collections.singletonList("reset-all");
                    } else if ("reset-custom".startsWith(args[0])) {
                        return Collections.singletonList("reset-custom");
                    } else if ("reset-display".startsWith(args[0])) {
                        return Collections.singletonList("reset-display");
                    } else if ("reset-list".startsWith(args[0])) {
                        return Collections.singletonList("reset-list");
                    } else if ("version".startsWith(args[0])) {
                        return Collections.singletonList("version");
                    }
                }
            }
        }
        return null;
    }
}
