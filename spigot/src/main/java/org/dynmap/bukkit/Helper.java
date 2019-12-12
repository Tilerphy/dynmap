package org.dynmap.bukkit;

import org.bukkit.Bukkit;
import org.dynmap.Log;
import org.dynmap.bukkit.helper.BukkitVersionHelper;
import org.dynmap.bukkit.helper.BukkitVersionHelperCB;
import org.dynmap.bukkit.helper.BukkitVersionHelperGlowstone;
import org.dynmap.bukkit.helper.v113.BukkitVersionHelperSpigot113;
import org.dynmap.bukkit.helper.v113_1.BukkitVersionHelperSpigot113_1;
import org.dynmap.bukkit.helper.v113_2.BukkitVersionHelperSpigot113_2;
import org.dynmap.bukkit.helper.v114.BukkitVersionHelperSpigot114;
import org.dynmap.bukkit.helper.v115.BukkitVersionHelperSpigot115;

public class Helper {
    
    public static final BukkitVersionHelper getHelper() {
        if (BukkitVersionHelper.helper == null) {
		BukkitVersionHelper.helper = new BukkitVersionHelperSpigot115();
        }
        return BukkitVersionHelper.helper;
    }

}
