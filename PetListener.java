import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Hashtable;
import java.lang.reflect.*;
import java.util.Random;

public class PetListener extends PluginListener {
	private static final Hashtable <Player, Pet> petsByPlayer = new Hashtable<Player, Pet>();


	public boolean onCommand(Player player, String[] split) {
		if(!player.canUseCommand(split[0]))
			return false;
		if(split[0].equalsIgnoreCase("/petcreate")) {
			if(split[1] == null) {
				player.sendMessage("Usage: /petcreate petname");
				return false;
			}
			Pet pet = petsByPlayer.get(player);
			if(pet != null) {
				player.sendMessage("You already have a pet!");
				return false;
			}
			pet = new Pet(player, split[1]);
			petsByPlayer.put(player, pet);
			pet.start();
			return true;
		}
		return false;
	}

	public void onPlayerMove(Player player, Location from, Location to) {
		Pet pet = petsByPlayer.get(player);
		if (pet != null)
			pet.onPlayerMove(from, to);

	}
}
