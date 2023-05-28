package finalAssignment;

import java.util.Random;

public class Rocket implements SpaceShip {
	private int rocketCost;
	private int rocketWeight;
	private int maxWeight;
	private double launchExplosionChance;
	private double landingCrashChance;
	private int currentWeight;

	public Rocket(int rocketCost, int rocketWeight, int maxWeight, double launchExplosionChance,
			double landingCrashChance) {
		this.setRocketCost(rocketCost);
		this.rocketWeight = rocketWeight;
		this.maxWeight = maxWeight;
		this.launchExplosionChance = launchExplosionChance;
		this.landingCrashChance = landingCrashChance;
		this.currentWeight = rocketWeight;
	}

	@Override
	public boolean launch() {
		double random = new Random().nextDouble();
		return random >= launchExplosionChance;
	}

	@Override
	public boolean land() {
		double random = new Random().nextDouble();
		return random >= landingCrashChance;
	}

	@Override
	public boolean canCarry(Item item) {
		return (currentWeight + item.getWeight()) <= maxWeight;
	}

	@Override
	public void carry(Item item) {
		currentWeight += item.getWeight();

	}

	public int getRocketCost() {
		return rocketCost;
	}

	public void setRocketCost(int rocketCost) {
		this.rocketCost = rocketCost;
	}

}
