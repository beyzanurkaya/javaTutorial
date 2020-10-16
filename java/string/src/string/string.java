package string;

public class string {

	public static void main(String[] args) {

		String mesaj = "Beyza Nur Kaya";
		System.out.println(mesaj);
		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Selam"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("A"));
		
		char [] c = new char[5];
		mesaj.getChars(0, 5, c, 0);
		
		System.out.println(c); 
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(0,3));
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
	}

	

}
