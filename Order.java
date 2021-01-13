import java.util.*;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Order {
	private ArrayList<Item> myOrder;
	private double totalprice;
	//constructor
	public Order() {
		myOrder = new ArrayList<Item>();
		totalprice = 0;
	}
	public void add(Item item, int qty) {
		for(int i=0; i<qty; i++) {
			myOrder.add(item);
			totalprice = totalprice + item.getCost();
		}
	}
	public Item getItem(int index) {
		return myOrder.get(index);
	}
	public String toString() {
		String st = "Total OWING: $" + totalprice;
		return st;
	}
	public void closeOrder() throws AddressException, MessagingException {
		for(int i = 0 ; i< myOrder.size(); i++) {
			Item m ;
			m = myOrder.get(i);		
		}
		//TODO
		System.out.println("What is your email?");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		EmailSender.send(s, "POS - YOUR BILL", createEmailContent());
	}
	public String createEmailContent() {
		String c = "";
		c = "**********************************\n";
		c = c + " YOUR ORDER DETAILS \n" ;
		c = c + "************************************\n";
		for(int i =0;i<myOrder.size();i++) {
			Item n;
			n = myOrder.get(i);
			c = c + "ITEM: " + n.getBrand() + " || COST: Rs. "+ n.getCost() + "\n";
		}
		c = c + "**********************************\r \n";
		c = c + "SUB TOTAL: Rs. " + totalprice + "\n";
		c = c + "**********************************";
		return c;
	}
	public void viewOrder() {
		for(int i =0;i<myOrder.size();i++) {
			Item n;
			n = myOrder.get(i);
			System.out.println("ITEM: " + n.getBrand() + " || COST: Rs. "+ n.getCost());
		}
		System.out.println("SUB TOTAL: Rs. " + totalprice);
	}
}
