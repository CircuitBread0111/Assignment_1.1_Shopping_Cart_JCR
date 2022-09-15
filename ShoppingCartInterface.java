
public interface ShoppingCartInterface {

	
	/**
	 * Checks whether the bag is empty or not.
	 * @return True if bag is empty; false if not
	 */
	public boolean isEmpty();
	
	
	/**
	 * Checks the number of items in the cart
	 * @return an integer number of items in the cart
	 */
	public int getCurrentSize();
	
	
	/**
	 * Checks the total price of items in the cart
	 * @return a double of the total sum of the price
	 */
	public double getTotalPrice();
	
	
	/**
	 * Adds a new item to the cart
	 * @param The object that will bed added as a new entry
	 * @return True if added successful; false if not
	 */
	public boolean add(Item newEntry);
	
	
	/**
	 * Removes last item from the cart, if available.
	 * @return The removed item, if it was successful, or nul.
	 */
	public Item remove();
	
	
	/**
	 * Removes one given item from the cart, if available
	 * @param anEntry The item to be removed
	 * @return True if removal was successful; false if not
	 */
	public boolean remove(Item anEntry);
	
	
	/**
	 * Removes all items from the cart
	 */
	public void clear();
	
	
	/**
	 * Checks if an item has been added or removed from the cart
	 * @return True if item was removed or added, false if not
	 */
	public boolean cartUpdate();
	
	
	/**
	 * Counts the number of times a specific item appears in the cart
	 * @param anEntry The item to count
	 * @return The number of times the item appears in the cart
	 */
	public int getFrequencyof(Item anEntry);

	
	/**
	 * Checks whether the cart contains a given item
	 * @param anEntry The given item
	 * @return True if the cart contains the item; false if not
	 */
	public boolean contains(Item anEntry);
	
	
	/**
	 * Retrieves all items in the cart
	 * @return An allocated array of all items in the bag
	 */
	public Object[] toArray();
}
		