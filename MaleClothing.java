
public class MaleClothing extends Clothing {
	String malethings;

	public MaleClothing(int cost,String brand,double size) {
		super(cost,brand,size);
		this.malethings=malethings;
	}
	
	public String getMalethings() {
		return malethings;
	}
	
	public void setMalethings(String malethings) {
		this.malethings=malethings;
	}
}
