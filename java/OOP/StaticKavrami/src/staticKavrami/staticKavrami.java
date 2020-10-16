package staticKavrami;

public class staticKavrami {
		
	public static void main(String[] args) {
		
		ProductManager m = new ProductManager();
		Product p = new Product();
		p.id = 1;
		p.name = "Laptop";
		p.price = 4000;
		
		m.add(p);
	}
}
