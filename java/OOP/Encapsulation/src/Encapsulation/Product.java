package Encapsulation;

public class Product {
	
	//default olarak public tanimlanir.
	private int id, stok;
	private String urun, ozlk;
	private double fiyat;
	
	public Product () { //metot overloading
		System.out.println("Yapici blok calisti.");
	}
	public Product (int i, int s, String u, String o, double f) { //yapici fonskiyonlar ilk deger atamasi icin yardimci olur
		id = i;
		stok = s;
		urun = u;
		ozlk = o;
		fiyat = f;
		System.out.println("Yapici blok calisti.");
	}
	
	//getter ve setterlar private elemana erisimi saglar.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; //this classin icindeki degiskeni isaret eder
	}
	
	public int getStok() {
		return stok;
	}
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public String getUrun() {
		return urun;
	}
	public void setUrun(String isim) {
		this.urun = isim;
	}
	
	public String getOzlk() {
		return ozlk;
	}
	public void setOzlk(String ozlk) {
		this.ozlk = ozlk;
	}
	
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
}
