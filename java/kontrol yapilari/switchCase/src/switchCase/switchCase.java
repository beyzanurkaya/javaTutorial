package switchCase;

public class switchCase {

	public static void main(String[] args) {
		
		char grade = 'A'; //kullanicidan girdi alinabilir.
		
		switch(grade) {
			case 'A':
				System.out.println("A ile gectiniz.");
				break;
			case 'B':
				System.out.println("B ile gectiniz.");
				break;
			case 'C':
				System.out.println("C ile gectiniz.");
				break;
			case 'D':
				System.out.println("D ile gectiniz.");
				break;
			case 'F':
				System.out.println("Kaldiniz.");
				break;
			default:
				System.out.println("Gecersiz not girdiniz.");
		}
	}

}
