package classYapisi;

public class classYapisi {
	
	public static void main(String[] args) {
		
		//referans tiplidir.
		CustomerManager c = new CustomerManager();
		CustomerManager c2 = new CustomerManager();
		c = c2; //cnin referans numarasi artık c2nin referans numarasina esit. 
		
		c.Add();
		c.Remove();
		c.Update();
		
		DortIslem i = new DortIslem();
		System.out.println(i.Topla(12, 24));
		System.out.println(i.Cikar(12, 24));
		System.out.println(i.Carp(12, 24));
		System.out.println(i.Bol(12, 24));
		
		/*
		int s = 10; //deger tiplidir.
		int s2 = 20;
		s2 = s;
		s = 30;
		System.out.println(s + " -- " + s2);
		
		int [] sayi = {1, 2, 3}; //referans tiplidir.
		int [] sayi2 = {4, 5, 6};
		sayi2 = sayi; //sayi2nin referans numarasi sayinin referans numarasina esit. Bu haliyle bellekte 2 tane ayni referans numarali nesne ayi seyi tutuyor.
		sayi[0] = 10;
		System.out.println(sayi2[0]);
		*/
	}

}
