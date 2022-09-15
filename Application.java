/**
 * 
 * @author Jerrin C. Redmon
 * Application for testing the behavior of ShoppingCart
 */
public class Application {
	
	public static void main(String args[]) {
		ShoppingCart cart = new ShoppingCart();
		
		//Defining Five Items
		Item num1 = new Item("Deck of Cards", 3.00);
		Item num2 = new Item("Super Mario 64", 45.00);
		Item num3 = new Item("The C Programming Language", 58.00);
		Item num4 = new Item("Nividia GTX 1080ti", 800.00);
		Item num5 = new Item("Lenovo t430 Thinkpad", 55.00);
		
		//Check if bag is empty
		System.out.println("Is the cart empty?:  " + cart.isEmpty());
		
		//adding items to the shopping cart
		cart.add(num1);
		cart.add(num2);
		cart.add(num3); 
		cart.add(num4);
		cart.add(num5);
		
		//prints current items in cart
		System.out.println("Items added to shopping cart: \n" + cart);
		
		//prints total
		System.out.println("Total price of all items in shopping cart: $" +cart.getTotalPrice());
		//checks current size
		System.out.println("The current amount of items in the cart:  " + cart.getCurrentSize());
		
		//remove item
		cart.remove();
		System.out.println("Items in the shopping cart: \n" +cart);
		System.out.println("Has the cart updated size?:  " + cart.cartUpdate());
		System.out.println("Has the cart updated size since last update called?:  " + cart.cartUpdate());

		//remove specific item and check price and size
		cart.remove(num2);
		System.out.println("Items in the shopping cart: \n" +cart);
		System.out.println("Total price of all items in shopping cart: $" +cart.getTotalPrice());
		System.out.println("The current amount of items in the cart:  " + cart.getCurrentSize());
		
		
		//added multiple of same item
		cart.add(num2);
		cart.add(num2);
		System.out.println("How many copies of " + num2 + "is in the shopping cart :  " + cart.getFrequencyof(num2));
		System.out.println("Items added to shopping cart: \n" + cart);
		System.out.println("Has the cart updated?:  " + cart.cartUpdate());
		System.out.println("Does the cart contain " + num4 + ": " + cart.contains(num4));
		
		//clear cart
		cart.clear();
		System.out.println("Clearing Cart!");
		System.out.println("The current amount of items in the cart:  " + cart.getCurrentSize());
		
		
		
	}

}
