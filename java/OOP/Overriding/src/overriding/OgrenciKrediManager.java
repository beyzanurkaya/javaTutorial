package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	
	//Overriding
	public double hesapla(double tutar) {
		return tutar * 1.1;
	}
}
