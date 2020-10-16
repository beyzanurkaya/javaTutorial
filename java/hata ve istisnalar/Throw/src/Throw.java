
public class Throw {

//hata firlatma: program hata verebilir ya da kusursuz calisabilir.
	
	private static double balance;
	
	public static void deposit(double amount) {
		balance += amount;
	}
	public static void withDraw(double amount) throws Exception {
		if(balance>=amount) {
			balance -= amount;
		}else {
			throw new Exception("Bakiye yetersiz.");
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Hesap: " + balance);
		deposit(100);
		System.out.println("Hesap: " + balance );
		withDraw(20);
		System.out.println("Hesap: " + balance);
		withDraw(90);
		System.out.println("Hesap: " + balance );

	}
	

}
