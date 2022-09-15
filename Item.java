
public class Item implements ItemInterface {

	private String itemName;
	private double itemPrice;
	
	public Item(String name, double price) {//Constructor
		itemName = name;
		itemPrice = price;
	}
	
	@Override
	public String getName() {
		return itemName;
	}

	@Override
	public double getPrice() {
		return itemPrice;
	}

	public String toString() {
		return String.format("Item: %s, Price: %.2f", itemName, itemPrice);
	}
}
