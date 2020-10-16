package polymorphism;

public class DatabaseLogger extends BaseLogger {
	
	//Overriding
	public void Log(String m) {
		System.out.println("Logger to database: " + m);
	}
}
