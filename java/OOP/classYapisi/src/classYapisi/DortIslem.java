package classYapisi;

public class DortIslem {

	public int Topla(int s, int s2) {
		return s + s2;
	}
	
	public int Cikar(int s, int s2) {
		return s - s2;
	}
	
	public int Carp(int s, int s2) {
		return s * s2;
	}
	
	public double Bol(int s, int s2) {
		if(s2 == 0) {
			return 0;
		}else
		return s / s2;
	}
}
