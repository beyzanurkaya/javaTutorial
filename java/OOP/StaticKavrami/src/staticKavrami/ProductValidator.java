package staticKavrami;

public class ProductValidator {
	
	/*
	public boolean isValid(Product p) {
		if(p.price > 0 && !p.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	*/
	
	//manager siniflar static yapilmaz. yapilan bir degisiklik her yerde degisir.
	public static boolean isValid(Product p) {
		if(p.price > 0 && !p.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	 
	
}
