package intputDizi;

import java.util.Scanner;

public class intputDizi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, i;
		int p = 0, n = 0;
		System.out.print("Kac sayi gireceksiniz: ");
		a = scan.nextInt();
		
		for(i = 0; i<a; i++) {
			System.out.print((i+1) + ". sayi: ");
			b = scan.nextInt();
			if(b>=0) {
				p = p+1;
			}else if(b<0){
				n = n+1;
			}
		}
		System.out.println("Pozitif sayi: " + p);
		System.out.println("Negatif sayi: " + n);
	}

}
