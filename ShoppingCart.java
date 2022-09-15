
public class ShoppingCart implements ShoppingCartInterface {

	
	
	/**
	 * Creates cart with the set capacity given by the Array Bag 
	 */
	private ArrayBag<Item> cart;
	int lastUpdatedSize = 0;
	public ShoppingCart() {
		cart = new ArrayBag<Item>();
	}
	
	/**
	 * Creates the shopping cart with the desired Capacity given by the Array Bag
	 * @param desiredCapacity capacity of the shopping cart
	 */
	public ShoppingCart(int desiredCapacity) {
		cart = new ArrayBag<Item>(desiredCapacity);
	}
	
	
	@Override
	public boolean isEmpty() {//Checks if cart is empty
		return cart.isEmpty();
	}

	@Override
	public int getCurrentSize() {//Gets the current size of the cart
		return cart.getCurrentSize();
	}

	@Override
	public double getTotalPrice() {//Gets total price in the cart
		double total = 0;
		for (int i = 0; i < cart.getCurrentSize(); i++) {
			Object[] item = cart.toArray();
			total += ((Item) item[i]).getPrice();   
		}
		return total;
		}

	@Override
	public boolean add(Item newEntry) {//adds item to cart
		return cart.add(newEntry);
	}

	@Override
	public Item remove() {//Removes item from cart
		return cart.remove();
	}

	@Override
	public boolean remove(Item anEntry) {//Removes specific item
		return cart.remove(anEntry);
	}

	@Override
	public void clear() {//clears cart
		cart.clear();
		
	}

	@Override
	public boolean cartUpdate() {
		if (lastUpdatedSize != cart.getCurrentSize()) {
			lastUpdatedSize = cart.getCurrentSize();
			return true;
		}
		else return false;
	}

	@Override
	public int getFrequencyof(Item anEntry) {
		return cart.getFrequencyOf(anEntry);
	}

	@Override
	public boolean contains(Item anEntry) {
		return cart.contains(anEntry);
	}

	@Override
	public Object[] toArray() {
		return cart.toArray();
	}
	
	public String toString() {
		String listing = "";
		Object cartArray[] = cart.toArray();
		for(int i = 0; i < cart.getCurrentSize(); i++) {
			listing += cartArray[i] + "\n";
		}
		return listing;
	}

}
