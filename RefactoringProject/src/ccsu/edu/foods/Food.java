package ccsu.edu.foods;

import ccsu.edu.xml.*;

public abstract class Food implements XMLAble{
	
	private FoodList ingredients = new FoodList();
	protected String name;
	
	public Food(String item1, String item2, String item3, String item4) 
	{
		ingredients.addItem(item1);
		ingredients.addItem(item2);
		ingredients.addItem(item3);
		ingredients.addItem(item4);
		
		
	}
	public Food(String item1, String item2, String item3) 
	{
		ingredients.addItem(item1);
		ingredients.addItem(item2);
		ingredients.addItem(item3);
		
	}
	public Food(String item1, String item2) 
	{
		ingredients.addItem(item1);
		ingredients.addItem(item2);
	}
	public String getName() {
		return name;
	}
	public Food(String item1) 
	{
		ingredients.addItem(item1);
	
	}
	// Template Method 
	public void prepareFood() {
		gatherIngredients();
		mixIngredients();
		putInCookingVessel();
		cook(); // Call to hook
		plateFood();
		
	}
	
	public void addIngredient(String item) {
		ingredients.addItem(item);
		
	}
	
	protected abstract void cook(); // Hook Method 

	private void plateFood() {
		 System.out.println("Food has been plated. Enjoy. ");
		
	}

	private void putInCookingVessel() {
		 
		 System.out.println("Food has been added to the cooking vessel.");

	}

	private void mixIngredients() {
		 System.out.println("Ingredients have been mixed.");

		  
	}

	private void gatherIngredients() {
		
		ingredients.displayList();
	}
	
	protected FoodList getIngredients() {
		return ingredients;
	}
	@Override
	public String toXML() {
		
 		return XMLUtil.createXML(this);
	}

}
