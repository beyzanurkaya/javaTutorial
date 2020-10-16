import java.util.Scanner;

public class Metotlar {
	
	void kisi() {
		System.out.print("İsminizi giriniz: ");
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		
		System.out.println("İsminiz: " + x);
	}
	
	static void birey() {
		System.out.print("İsminizi giriniz: ");
		Scanner scan = new Scanner(System.in);
		String y = scan.next();
		
		System.out.println("İsminiz: " + y);
	}
	
	static int enBuyuk(int x, int y, int z) {
		
		return Math.max(Math.max(x, y), z);
		
	}
	
	static int enKucuk(int a, int b, int c) {
		
		return Math.min(Math.min(a, b), c);
		
	}

	public static void main(String[] args) {
		
		birey();
		System.out.println("---------------------");
		Metotlar k = new Metotlar();
		k.kisi();
		
		System.out.println(enBuyuk(12, 98, 72));
		System.out.println(enKucuk(13, 39, 61));
		
		
	}

}
