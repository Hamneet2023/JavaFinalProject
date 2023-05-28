package finalAssignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Simulation {
	public ArrayList<Item> loadItems() throws IOException {
		ArrayList<Item> items = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:/Users/hamne/OneDrive/Desktop/test.txt"));
			String lines;
			while ((lines = reader.readLine()) != null) {
				String[] parts = lines.split("=");
				String name = parts[0];
				//System.out.println(name);
				int weight = Integer.parseInt(parts[1]);
				//System.out.println(weight);
				Item item = new Item(name, weight);
				items.add(item);
			    //System.out.println(lines);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("I am not able to read your file please check all the possible ways:");
			e.printStackTrace();
		}
		return items;
	}
	
	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
	// here was  showing error on R1 and R2 check screenshot giving me three possibilities
	// add arguments as i did
	// change constructor remove parameter.
	//	create constructor  R1()
        ArrayList<Rocket> rockets = new ArrayList<>();
        R1 rocket = new R1(100000000, 10000, 18000, 0.05, 0.01);
        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new R1(100000000, 10000, 18000, 0.05, 0.01);
                rocket.carry(item);
            }
        }
        rockets.add(rocket);
        return rockets;
    }
	
	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        R2 rocket = new R2();
        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new R2();
                rocket.carry(item);
            }
        }
        rockets.add(rocket);
        return rockets;
    }
	
	public int runSimulation(ArrayList<Rocket> rockets) {
        int totalBudget = 0;
        for (Rocket rocket : rockets) {
            totalBudget += rocket.getRocketCost();
            while (!rocket.launch() || !rocket.land()) {
                totalBudget += rocket.getRocketCost();
            }
        }
        return totalBudget;
    }


}
