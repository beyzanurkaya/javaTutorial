package threading;

public class Threading {

	public static void main(String[] args) {
		
		KronometreThread thread = new KronometreThread("thread");
		KronometreThread thread2 = new KronometreThread("thread2");
		KronometreThread thread3 = new KronometreThread("thread3");
		
		thread.start();
		thread2.start();
		thread3.start();
	}

}
