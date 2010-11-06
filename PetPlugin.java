import java.util.logging.Logger;

public class PetPlugin extends Plugin {
	private PetListener listener = new PetListener();
	protected static final Logger log = Logger.getLogger("Minecraft");
	public static String name = "Pet Plugin for hMod B124";
	public static String version = "0.1";
	protected PropertiesFile config = new PropertiesFile("PetMod.txt");

	public void initialize() {
		/* Add in listener overrides here */
		etc.getLoader().addListener(PluginLoader.Hook.COMMAND, listener, this, PetListener.Priority.MEDIUM);
		etc.getLoader().addListener(PluginLoader.Hook.PLAYER_MOVE, listener, this, PetListener.Priority.MEDIUM);
	}

	public void enable() {
		log.info(name + " was enabled.");
	}

	public void disable() {
		log.info(name + " was disabled.");
	}

}
