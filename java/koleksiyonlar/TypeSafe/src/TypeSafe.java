import java.util.ArrayList;
import java.util.Collections;

public class TypeSafe {

	public static void main(String[] args) {

		ArrayList <String> sehir = new ArrayList<String>();
		sehir.add("İstanbul");
		sehir.add("Izmir");
		sehir.add("Ankara");
		sehir.add("Aydın");
		
		Collections.sort(sehir);
		sehir.remove(0);
		
		for(String s:sehir) {
			System.out.println(s);
		}
		
	}

}
