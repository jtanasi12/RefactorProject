package ccsu.edu.client;
import  ccsu.edu.foods.*;

public class Client {

	public static void main(String[] args) {
	
		Pizza pizza = new Pizza("Tomato Sauce", "Onions", "Peperoni", "Cheese");
		pizza.prepareFood();
		
		System.out.println();
		System.out.println();

		Cake cake = new Cake("Chocalate", "Strawberries");
		cake.prepareFood();
	
		pizza.toXML();
		
		System.out.println();
		System.out.println(pizza.toXML());
	}

}
