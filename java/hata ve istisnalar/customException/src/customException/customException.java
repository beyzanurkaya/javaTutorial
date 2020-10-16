package customException;

public class customException  {
	
	static void validate(int age) throws benimException{
		if(age < 18)
			throw new benimException("Resit degil.");
		else
			System.out.println("Welcome to vote.");
	}
	public static void main(String[] args) {
		
		try {
			validate(22);
			validate(13);
		}catch(Exception e) {
			System.out.println("Hata mesaji: " + e);
		}
		System.out.println("Programin sonu.");
		
	}
	
}


