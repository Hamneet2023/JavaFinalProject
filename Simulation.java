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
				int weight = Integer.parseInt(parts[1]);
				Item item = new Item(name, weight);
				items.add(item);
				// System.out.println(lines);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("I am not able to read your file please check all the possible ways:");
			e.printStackTrace();
		}
		return items;
	}
	
		public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		    ArrayList<Rocket> rocket1 = new ArrayList<>();
		    
		    return rocket1;
		}
	
		public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		    ArrayList<Rocket> rocket2 = new ArrayList<>();
		   
		    return rocket2;
		}
		
		public void runSimulation(ArrayList<Rocket> rocket1,ArrayList<Rocket>rocket2) {
			
		}

	
}
