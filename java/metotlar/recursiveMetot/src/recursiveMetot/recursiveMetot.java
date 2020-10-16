package recursiveMetot;

import java.util.Scanner;

public class recursiveMetot {
	
	private static Scanner scan;
	
	static int fakt(int n) {
		int i, f = 1;
		for(i = n; i>=1; i--) {
			f = f*i;
		}
		return f;
	}
	
	static int recursiveFakt(int n) {
		if(n<=1)
			return n;
		else
			return (n*recursiveFakt(n-1));
	}
	public static void main(String[] args) {
		
		int n;
		scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		n = scan.nextInt();
		
		System.out.println(n + "! = " + fakt(n));
		System.out.print(n + "! = " + recursiveFakt(n));
		
		

	}

}
