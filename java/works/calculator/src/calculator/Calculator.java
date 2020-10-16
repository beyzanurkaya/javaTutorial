package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("1 - Summation\n");
		System.out.println("2 - Elimination\n");
		System.out.println("3 - Multiplication\n");
		System.out.println("4 - Division\n");
		System.out.println("Choose the operation you want to do: ");
		int opr = input.nextInt();
		
		float num, num2;
		System.out.print("Enter first number: ");
		num = input.nextFloat();
		System.out.print("Enter second number: ");
		num2 = input.nextFloat();
		
		
		switch(opr) {
		case 1:
			System.out.println(num + " + " + num2 + " = " + (num+num2));
			break;
		case 2:
			System.out.println(num + " - " + num2 + " = " + (num-num2));
			break;
		case 3:
			System.out.println(num + " * " + num2 + " = " + (num*num2));
			break;
		case 4:
			System.out.println(num + " / " + num2 + " = " + (num/num2));
			break;
		}

		
	}

}
