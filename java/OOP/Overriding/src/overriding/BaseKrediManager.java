package overriding;

public class BaseKrediManager {

	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	/*
	public final double hesapla(double tutar) {
		return tutar * 1.18;
	} ***final keywordu overriding yapilmasini engeller.
	*/
}
