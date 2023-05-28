package finalAssignment;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass {
	public static void main(String args[]) throws IOException {
		 Simulation simulation = new Simulation();
	        
	        // Load items
	        ArrayList<Item> items = simulation.loadItems();
	        
	        // Load rocket R1
	        ArrayList<Rocket> r1Fleet = simulation.loadU1(items);
	        
	        // Run the simulation using the fleet of R1 rockets and display the total budget required
	        int r1TotalBudget = simulation.runSimulation(r1Fleet);
	        System.out.println("Total cost for R1 fleet: $" + r1TotalBudget);
	        
	        // Load rocket R2
	        ArrayList<Rocket> r2Fleet = simulation.loadU2(items);
	        //Run the simulation using the fleet of R2 rockets and display the total budget required
	        int r2TotalBudget = simulation.runSimulation(r2Fleet);
	        System.out.println("Total cost for R2 fleet: $" + r2TotalBudget);
		
	}
}
