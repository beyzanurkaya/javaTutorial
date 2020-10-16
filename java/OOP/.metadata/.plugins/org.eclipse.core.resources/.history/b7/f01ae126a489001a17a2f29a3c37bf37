package polymorphism;

public class CustomerManager {
	
	private BaseLogger blg;
	
	public CustomerManager(BaseLogger bl) {
		this.blg = bl;
	}
	
	public void Add() {
		System.out.println("Musteri eklendi.");
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.Log("Log mesaji"); Ideal bi kullanim degildir databaseLoggera bagimlilik olusturur
		this.blg.Log("Log mesaji");
	}
}
