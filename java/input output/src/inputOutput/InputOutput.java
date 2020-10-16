package inputOutput;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		System.out.print("Bir sayi giriniz: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.print("Baska bir sayi giriniz: ");
		int a = new Scanner(System.in).nextInt();
		
		System.out.print("Baska bir sayi daha giriniz: ");
		int b;
		b = new Scanner(System.in).nextInt();
		
		System.out.println(x + " " + a + " " + b);
		
	}

}
