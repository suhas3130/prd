public class Food extends Item{
		double measurement;
		
		public Food(int cost,String brand,double measurement) {
			super(cost, brand);
			this.measurement = measurement;
		}
		public double getMeasurement() {
			return measurement;
		}
		public void setMeasurement() {
			this.measurement = measurement;
		}
		
	}
