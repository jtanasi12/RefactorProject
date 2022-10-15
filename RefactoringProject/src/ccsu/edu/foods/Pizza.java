package ccsu.edu.foods;

import ccsu.edu.xml.XMLUtil;

public class Pizza extends Food{

	public Pizza(String item1, String item2, String item3, String item4) {
		
		super(item1, item2, item3, item4);
		System.out.println("\t\tFresh Pizza!");
		
		name = "Pizza";
		
	}
	public Pizza(String item1, String item2, String item3) {
		
		super(item1, item2, item3);
		System.out.println("\t\tFresh Pizza!");
		
		name = "Pizza";
		
	}
	public Pizza(String item1, String item2) {
	
	super(item1, item2);
	System.out.println("\t\tFresh Pizza!");
	
	name = "Pizza";
	
	}
	public Pizza(String item1) {
	
	super(item1);
	System.out.println("\t\tFresh Pizza!");
	
	name = "Pizza";
	
	}
	@Override
	protected void cook() {
		System.out.println("Bake pizza in the 475°F oven, one at a time, until the crust is browned and the cheese is golden, \n"
				+ "about 10 to 15 minutes. If you want, toward the end of the cooking time you can sprinkle"
				+ " on a little more cheese.");
		 
	}
	
	public String toString() {
		String XL = "Pizza XL";
		
		return XL;
	}
}
