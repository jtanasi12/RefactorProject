package ccsu.edu.foods;

import java.util.*;

public class FoodList {
	
	private ArrayList<String> ingredients;
	
	public FoodList() {
		ingredients = new ArrayList<>();
	}
	
	public void addItem(String item) {
		ingredients.add(item);
	}
	
	public void displayList() {
		Iterator<String> iterate = ingredients.iterator();
		
		System.out.print("Ingredients:  ");
		
		if(iterate.hasNext())
			System.out.print(iterate.next());
		
		while(iterate.hasNext()) {
			System.out.print(", " + iterate.next());
		}
		
		System.out.println();
		System.out.println();

	}

	public String toString() {
		String output = null;
		
		displayList();
		
		return output;
	}
}
