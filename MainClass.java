package finalAssignment;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass {
	public static void main(String args[]) throws IOException {
		Simulation simulation = new Simulation();
		  ArrayList<Item>items=simulation.loadItems();
		  ArrayList<Rocket> rocket1=simulation.loadU1(items);
		  ArrayList<Rocket> rocket2=simulation.loadU2(items);
		  simulation.runSimulation(rocket1, rocket2);
		
	}
}
