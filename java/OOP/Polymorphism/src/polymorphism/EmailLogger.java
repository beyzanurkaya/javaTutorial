package polymorphism;

public class EmailLogger extends BaseLogger {
	
	//Overriding
	public void Log(String m) {
		System.out.println("Logger to email: " + m);
	}
}
