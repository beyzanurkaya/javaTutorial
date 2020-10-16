package referansMetot;

import java.util.Scanner;

public class referansMetot {
	
	static int s = 16; //global degisken
	
	static void RefMetot(int s1) { //referansini alan metot
		referansMetot.s = 6; //referans ile aktardiginda deger programin her yerinde degisir.
	}
	static void DegMetot(int s1) { //degerini alan metot

		s1 = 98; //deger ile aktardiginda alt metotta deger degisse de ana programda degismez
		System.out.println("Alt metotun icinde :" + s1);
	}
	private static Scanner gir;
	
	static double cevir(double n) {
		return((n-32)/1.8);
	}
	public static void main(String[] args) {
		
		/*
		double F, C;
		System.out.print("Fahrenayt degeri: ");
		gir = new Scanner(System.in);
		F = gir.nextDouble();
		C = cevir(F);
		System.out.println(C + " derecedir.");
		
		*/
		
		System.out.println("Degiskenin ilk degeri: " + s);
		DegMetot(s); 
		System.out.println("Degerini al: " + s); 
		RefMetot(s);
		System.out.println("Referansini al: " + s); 
	}

}
