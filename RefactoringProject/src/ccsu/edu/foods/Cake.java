package ccsu.edu.foods;

import ccsu.edu.xml.*;

public class Cake extends Food{

public Cake(String item1, String item2, String item3, String item4) {
		
		super(item1, item2, item3, item4);
		System.out.println("\t\tFresh Cake!");
		
		name = "Cake";
		
	}
	public Cake(String item1, String item2, String item3) {
		
		super(item1, item2, item3);
		System.out.println("\t\tFresh Cake!");
		
		name = "Cake";

		
	}
	public Cake(String item1, String item2) {
	
	super(item1, item2);
	System.out.println("\t\tFresh Cake!");
	
	name = "Cake";

	
	}
	public Cake(String item1) {
	
	super(item1);
	System.out.println("\t\tFresh Cake!");
	
	name = "Cake";

	
	}
	
	public void candlesLit() {
		System.out.println("The candles are lit!!");
	}
	@Override
	protected void cook() {
		System.out.println("Preheat the oven to 325 °F (163 °C) and grease and flour a cake pan.\n"
				+ "Pound cakes are best baked in deep pans, such as loaf pans or bundt pans.\n"
				+ "Use butter or shortening to grease the pan. Then, sprinkle a light layer of flour into the pan,\n"
				+ "rotate the pan until it's evenly coated, then tap out the excess flour.");
		 
	}
	
	//Override
	public void prepareFood() {
		super.prepareFood();
		candlesLit();
	}

}
