package boxing.player;

public class Fighter {

	private String name;
	private int damage;
	private int health;
	private int weight;
	private int dodge;

	public Fighter(String name, int damage, int health, int weight, int dodge) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int hit(Fighter foe) {

		if (foe.isDodge()) {
			System.out.println(foe.getName() + " is dodged the damage");

		} else {
			System.out.println(this.getName() + " hit the " + foe.getName() + " " + this.getDamage() + " damage");
			if (foe.getHealth() - this.getDamage() < 0) {
				return foe.getHealth();

			}
			return this.getDamage();

		}
		return 0;

	}

	private boolean isDodge() {

		int dodgechange = (int) (Math.random() * 100);

		return dodgechange <= this.dodge;
	}

}
