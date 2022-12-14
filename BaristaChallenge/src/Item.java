
public class Item {
	// Private member variables
	private String name;
	private double price;
	
	// Constructors for Item
	public Item() {
		
	}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
}
