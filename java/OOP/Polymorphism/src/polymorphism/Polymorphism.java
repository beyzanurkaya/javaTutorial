package polymorphism;

public class Polymorphism {

	public static void main(String[] args) {

		EmailLogger el = new EmailLogger();
		el.Log("EmailLogger");
		
		BaseLogger[] loggers = new BaseLogger[] {
				new FileLogger(), new EmailLogger(), new DatabaseLogger()
		};
		
		for(BaseLogger log:loggers) {
			log.Log("Log mesaji");
		}
		
		CustomerManager cm = new CustomerManager(new DatabaseLogger());
		cm.Add();
		
	}

}
