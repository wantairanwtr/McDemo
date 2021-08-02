package wantairan.wan117;

import org.bukkit.OfflinePlayer;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class Papi extends PlaceholderExpansion {

    @Override
    public String getAuthor() {
        return "wantairan";
    }

    @Override
    public String getIdentifier() {
        return "hello";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, String params) {
        if(params.equalsIgnoreCase("name")) {
            return player == null ? null : player.getName(); // "name" requires the player to be valid
        }

        if(params.equalsIgnoreCase("placeholder1")) {
            return "Placeholder Text 1";
        }

        if(params.equalsIgnoreCase("placeholder2")) {
            return "Placeholder Text 2";
        }

        return null; // Placeholder is unknown by the Expansion
    }
}
