import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Hashtable;
import java.lang.reflect.*;
import java.util.Random;

public class PetListener extends PluginListener {
	private static final Hashtable <Player, 

	public boolean onCommand(Player player, String[] split) {
		if(split[0].equalsIgnoreCase("/petcreate"))
			if(player.canUseCommand(split[0])) {

			}

	}
}
