package Encapsulation;

public class fieldAttribute {

	public static void main(String[] args) {
		
		Product p = new Product(1, 7, "Laptop", "Apple", 5000);
		Product p2 = new Product();
		
		p2.setId(2);
		p2.setUrun("Laptop");
		p2.setOzlk("Windows");
		p2.setFiyat(4000);
		p2.setStok(6);
		 
		System.out.println(p.getId() + " " + p.getUrun() + " " + p.getOzlk() + " " + p.getFiyat() + " " + p.getStok());
		System.out.println(p2.getId() + " " + p2.getUrun() + " " + p2.getOzlk() + " " + p2.getFiyat() + " " + p2.getStok());

		ProductManager pm = new ProductManager();
		pm.Add(p);
		

	}

}
