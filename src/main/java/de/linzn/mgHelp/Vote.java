package de.linzn.mgHelp;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ClickEvent.Action;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class Vote extends Command {
    public Vote() {
        super("vote");
    }

    public void execute(CommandSender sender, String[] args) {
        this.vote(sender);
    }

    private void vote(CommandSender sender) {
        TextComponent vpage = new TextComponent(" §2Voteseiten öffnen: §dKlicke hier");
        vpage.setClickEvent(new ClickEvent(Action.OPEN_URL, "https://vote.minegaming.de"));
        vpage.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder("§dÖffne die Voteseiten auf https://vote.minegaming.de")).create()));
        TextComponent vote1 = new TextComponent(" §2Direktvote 1: §dKlicke hier");
        vote1.setClickEvent(new ClickEvent(Action.OPEN_URL, "https://minecraft-server.eu/vote/index/128017"));
        vote1.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder("§dDirektvote 1 öffnen")).create()));
        TextComponent vote2 = new TextComponent(" §2Direktvote 2: §dKlicke hier");
        vote2.setClickEvent(new ClickEvent(Action.OPEN_URL, "https://www.minecraft-serverlist.net/vote/13192"));
        vote2.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder("§dDirektvote 2 öffnen")).create()));
        TextComponent vote3 = new TextComponent(" §2Direktvote 3: §dKlicke hier");
        vote3.setClickEvent(new ClickEvent(Action.OPEN_URL, "https://minecraft-server.net/vote/minegaming/"));
        vote3.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder("§dDirektvote 3 öffnen")).create()));
        sender.sendMessage(new TextComponent("§2§lUnsere Voteseiten werden unter diesem §2§lLink §2§laufgelistet!"));
        sender.sendMessage(vpage);
        sender.sendMessage(vote1);
        sender.sendMessage(vote2);
        sender.sendMessage(vote3);
    }
}
