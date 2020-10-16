package polymorphism;

public class FileLogger extends BaseLogger {
	
	//Overriding
	public void Log(String m) {
		System.out.println("Logger to file: " + m);
	}
}
