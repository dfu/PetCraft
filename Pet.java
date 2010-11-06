public class Pet {
	private Mob pet;
	private final Player player;
	private static final int MAX_DISTANCE = 5;
	private String name;
	private int health;

	public Pet(Player player, String petname) {
		this.player = player;
		this.name = petname;
	}

	public void start() {
		pet = new Mob("Chicken", player.getLocation());
		pet.spawn();
		this.health = pet.getHealth();
		player.sendMessage("You spawned a pet named " + name + "!");
		onPlayerMove(null,null);
	}

	public void kill() {
		pet.setHealth(-1);
		player.sendMessage("Your pet has died.");
	}

	public void put_away() {
		this.health = pet.getHealth();
		pet.setHealth(-1);
		player.sendMessage("You put away " + name + ".");
	}

	public void take_out() {
		pet.spawn();
		pet.setHealth(health);
		onPlayerMove(null, null);
		player.sendMessage("You took out " + name + ".");
	}

    public void onPlayerMove(Location from, Location to) {
		Location loc = player.getLocation();
		if (Utils.distance(pet.getX(), pet.getY(), pet.getZ(), loc.x, loc.y, loc.z) > MAX_DISTANCE) {
			pet.teleportTo(loc);
		}
	}
}
