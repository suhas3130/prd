import java.util.*;
public abstract class Item {
	
	public int cost;
	public String brand;
	
	public Item(int cost,String brand) {
		this.cost=cost;
		this.brand=brand;	
	}
	public int getCost() {
		return cost;
	}
	public void setCost() {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand() {
		this.brand = brand;
	}
}
