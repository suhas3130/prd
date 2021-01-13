import java.util.*;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import java.io.*;
public class POS {

	public static ArrayList<Integer> prices = new ArrayList<Integer>();
	
	public static void setup() throws FileNotFoundException {
		File f = new File("C:\\Users\\Prerana\\Desktop\\prices.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			int p = Integer.parseInt(s);
			prices.add(p);
		}
	}
	public static void main(String[] args) throws FileNotFoundException, AddressException, MessagingException {
		
		while(true) {
			setup();
			System.out.println("Do You Want to create an order?");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			if (s.equals("Y") || s.equals("y")) {
				Order o = new Order();
				while(true) {
					menu("main");
					String s1 = sc.nextLine();
					if(s1.equals("1")) {
						Paint p = new Paint(prices.get(0), "Asian Paints" , 2);
						System.out.println("How many paint you need?");
						String s2 = sc.nextLine();
						int qty = Integer.parseInt(s2);
						o.add(p, qty);
					}
					else if(s1.equals("2")) {
						menu("beverage");
						String s2 = sc.nextLine();
						Item b = itemFactory(s2, s1);
						System.out.println("How many " +s2 +" you need?");
						String s3 = sc.nextLine();
						int qty = Integer.parseInt(s3);
						o.add(b, qty);
					}
					else if(s1.equals("3")) {
						Fruits f = new Fruits(prices.get(2), "Apple", 4, 4);
						System.out.println("How many paint you need?");
						String s4 = sc.nextLine();
						int qty = Integer.parseInt(s4);
						o.add(f, qty);
						}
					else if(s1.equals("4")) {
						MaleClothing m = new MaleClothing(prices.get(3), "Pants", 36);
						System.out.println("How many Clothes you need?");
						String s5 = sc.nextLine();
						int qty = Integer.parseInt(s5);
						o.add(m, qty);
					}
					else if(s1.equals("5")) {
						FemaleClothing c = new FemaleClothing(prices.get(4), "Kurtha", 36);
						System.out.println("How many Clothes you need?");
						String s6 = sc.nextLine();
						int qty = Integer.parseInt(s6);
						o.add(c, qty);
					
					}
					else if(s1.equals("6")) {
						o.closeOrder();
						System.out.println(o);
						break;
					}
					else if(s1.equals("7")) {
						o.viewOrder();
					}
				}
				
			
		}else {
			break;
		}
			
		}
		
}
	public static void menu(String s) {
		if(s.equals("main")) {
			System.out.println("What Items Would You like to Buy?");
			System.out.println("Press 1 for Paint");
			System.out.println("Press 2 for Beverage");
			System.out.println("Press 3 for Fruits");
			System.out.println("Press 4 for Male Clothing");
			System.out.println("Press 5 for Female Clothing");
			System.out.println("Press 6 to Complete Order");
			System.out.println("Press 7 to View Order");
		}
		if(s.equals("beverage")) {
			System.out.println("What Bev Would You like to Buy?");
			System.out.println("Type Coke for Coke");
			System.out.println("Type ThumbsUp for ThumbsUp");
			System.out.println("Type Pepsi for Pepsi");
			System.out.println("Type Frooti for Frooti");
			System.out.println("Type Dew for Dew");
			System.out.println("Type Coffee for Coffee");
			System.out.println("Type Tea for Tea");
		}
	}
	public static Item itemFactory(String b, String mainmenuoption){
		if(mainmenuoption.equals("1")) {
			Paint p = new Paint(prices.get(0), b , 2);
			return p;
		}
		else if(mainmenuoption.equals("2")) {
			Beverages u = new Beverages(prices.get(1), b, 2, 2);
			return u;
		}
		else if(mainmenuoption.equals("3")) {
			Fruits u = new Fruits(prices.get(1), b, 2, 2);
			return u;
		}
		else {
			return null;
		}
	}
}