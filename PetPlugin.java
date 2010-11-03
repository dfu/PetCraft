import java.util.logging.Logger;

public class PetPlugin extends Plugin {
	private PetListener listener = new PetListener();
	protected static final Logger log = Logger.getLogger("Minecraft");
	public static String name = "Pet Plugin for hMod B124";
	public static String version = "0.1";
	protected PropertiesFile config = new PropertiesFile("PetMod.txt");

	public void initialize() {
		/* Add in listener overrides here */
	}

	public void enable() {
		log.info(name + " was enabled.");
	}

	public void disable() {
		log.info(name + " was disabled.");
	}

}
