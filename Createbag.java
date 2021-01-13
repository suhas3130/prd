import java.util.*;
public class Createbag {

	String bagbrand;
	String type;
	String colour;
	
	public Createbag(String b){
		bagbrand = b;
	}
	
	public void set_details(String b,String t,String c){
		bagbrand = b;
		type= t;
		colour= c;
	}
	public void get_details(){
		
	}
	
	
	public static void main(String[]args) {
		Createbag mybag=new Createbag("Allensolly");
		mybag.set_details("allensolly","handbag","red");
		
		//Bag handbag=new Bag ("allensolly","handbag","red");
		
		System.out.println(mybag.bagbrand);
	}
}
