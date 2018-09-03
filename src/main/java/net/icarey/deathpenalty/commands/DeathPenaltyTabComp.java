package net.icarey.deathpenalty.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class DeathPenaltyTabComp implements TabCompleter {
    public DeathPenaltyTabComp() {
    }

    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("deathpenalty")) {
            new ArrayList();
            if (args.length == 1) {
                ArrayList<String> completions = new ArrayList(Arrays.asList("help", "reload"));
                completions = this.getAppliableTabCompleters(args.length == 1 ? args[0] : "", completions);
                Collections.sort(completions);
                return completions;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    public ArrayList<String> getAppliableTabCompleters(String arg, ArrayList<String> completions) {
        if (arg != null && !arg.equalsIgnoreCase("")) {
            ArrayList<String> valid = new ArrayList();
            Iterator var5 = completions.iterator();

            while(var5.hasNext()) {
                String posib = (String)var5.next();
                if (posib.startsWith(arg)) {
                    valid.add(posib);
                }
            }

            return valid;
        } else {
            return completions;
        }
    }
}
