package classArrayList;

import java.util.ArrayList;

public class classArrayList {
	
	int id;
	String ad, soyad;
	
	public classArrayList() {
		
	}
	public classArrayList(int id, String ad, String soyad) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
	}
	public static void main(String[] args) {
		ArrayList<classArrayList> birey = new ArrayList<classArrayList>();
		birey.add(new classArrayList(1, "Beyza Nur", "Kaya"));
		
		for(classArrayList b:birey) {
			System.out.print(b.id + " ");
			System.out.print(b.ad + " ");
			System.out.print(b.soyad);
		}
	}
	

}
