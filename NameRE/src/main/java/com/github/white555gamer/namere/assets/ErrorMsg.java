package com.github.white555gamer.namere.assets;

import static org.bukkit.ChatColor.RED;

public class ErrorMsg {

    public static String UnidentifiedCommand = RED + "ERROR: Unidentified Command.";
    public static String InsufficientCommand = RED + "ERROR: Insufficient Commands";
    public static String OpPermissionRequired = RED + "ERROR: Op permission is required.";

    public static String PlayerNotFound(String[] args) {

        return RED + "ERROR: Player \"" + args[1] + "\" is not found.";

    }

}
