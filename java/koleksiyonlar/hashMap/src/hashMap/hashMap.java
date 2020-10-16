package hashMap;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("book", "kitap");
		sozluk.put("computer", "bilgisayar");
		sozluk.put("table", "masa");
		
		System.out.println(sozluk.get("computer"));
		sozluk.remove("book");
	}

}
