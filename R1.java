package finalAssignment;

import java.util.Random;

public class R1 extends Rocket {

	public R1(int rocketCost, int rocketWeight, int maxWeight, double launchExplosionChance,
			double landingCrashChance) {
		super(rocketCost, rocketWeight, maxWeight, launchExplosionChance, landingCrashChance);
		
	}
	 @Override
	    public boolean launch() {
	        return super.launch();
	    }
	    
	    @Override
	    public boolean land() {
	        return super.land();
	    }

}
