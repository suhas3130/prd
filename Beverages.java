
public class Beverages extends Food{
	private double liters;
	
	public Beverages(int cost,String brand,double measurement, double liters) {
		super(cost, brand, measurement);
		this.liters = liters;
	}
	public double getLiters() {
		return this.liters;
	}
	public void setLiters(double liters) {
		this.liters = liters;
	}
	public Boolean equals(Beverages b) {
		if(b.cost == this.cost && b.brand.equals(this.brand)) {
			return true;
		}
		else {
			return false;
		}
	}
}
