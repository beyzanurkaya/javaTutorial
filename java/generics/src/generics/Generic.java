package generics;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		
		//bu yapiya generic denir.c
		ArrayList <String> sehirler = new ArrayList<String>();
		sehirler.add("Istanbul");
		sehirler.add("Düsseldorf");
		sehirler.add("San Francisco");
		
		MyList <Customer> sehir = new MyList<Customer>();

	}

}
