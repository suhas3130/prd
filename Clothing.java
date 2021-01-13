
public class Clothing extends Item{
 double size;
 
 public Clothing(int cost,String brand,double size) {
	 super(cost,brand);
	 this.size=size; 
 }
 
 public double getSize() {
	 return size;
 }
 public void setSize() {
	 this.size=size;
 }
}
