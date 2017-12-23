package de.linzn.mgHelp;

import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
    public Main() {
    }

    public void onDisable() {
    }

    public void onEnable() {
        this.getProxy().getPluginManager().registerCommand(this, new Help());
        this.getProxy().getPluginManager().registerCommand(this, new Vote());
    }
}
