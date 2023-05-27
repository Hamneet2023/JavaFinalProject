package finalAssignment;

public class Rocket implements SpaceShip {
	private int rocketCost;
	private int rocketWeight;
	private int maxWeight;
	private double launchExplosionChance;
	private double landingCrashChance;
	private int currentWeight;

	public Rocket(int rocketCost2, int rocketWeight2, int maxWeight2, double launchExplosionChance2, double landingCrashChance2, int currentWeight2) {
		super();
		this.rocketCost = rocketCost;
		this.rocketWeight = rocketWeight;
		this.maxWeight = maxWeight;
		this.launchExplosionChance = launchExplosionChance;
		this.landingCrashChance = landingCrashChance;
		this.currentWeight = currentWeight;
	}

	@Override
	public boolean launch() {
		double random = Math.random();
        double chance = launchExplosionChance * ((double) currentWeight / maxWeight);
        return random > chance;
	}

	@Override
	public boolean land() {
		double random = Math.random();
        double chance = landingCrashChance * ((double) currentWeight / maxWeight);
        return random > chance;
	}

	@Override
	public boolean canCarry(Item item) {
    return currentWeight + item.getWeight() <= maxWeight;
	}

	@Override
	public void carry(Item item) {
		 currentWeight += item.getWeight();
	}

}
