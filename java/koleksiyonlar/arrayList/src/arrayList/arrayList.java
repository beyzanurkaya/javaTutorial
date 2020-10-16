package arrayList;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList kolek = new ArrayList();
		System.out.println(kolek.size());
		kolek.add(1);
		kolek.add(3);
		System.out.println(kolek.size());
		kolek.add("beyza");
		System.out.println(kolek.size());
		System.out.println(kolek.get(2));
		kolek.set(1, "kaya");
		System.out.println(kolek.get(1));
		System.out.println();
		for(Object i:kolek) { //Object anahtar kelime
			System.out.println(i);
		}
	}

}
