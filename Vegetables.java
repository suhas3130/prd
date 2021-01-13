
public class Vegetables extends Food {
	private double weight;
	
	public Vegetables(int cost, String brand, double measurement, double weight) {
		super(cost, brand, measurement);
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight() {
		this.weight = weight;
	}

}
