
public class Paint extends Item{
		double measurement;
		
		public Paint(int cost,String brand,double measurement) {
			super(cost, brand);
			this.measurement = measurement;
		}
		public double getMeasurement() {
			return measurement;
		}
		public void setMeasurement(double measurement) {
			this.measurement = measurement;
		}
		
	}