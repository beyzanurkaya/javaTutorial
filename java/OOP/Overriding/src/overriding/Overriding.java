package overriding;

public class Overriding {

	public static void main(String[] args) {

		MemurKrediManager o = new MemurKrediManager();
		System.out.println(o.hesapla(1000));
		
		BaseKrediManager[] kredi = new BaseKrediManager[] {
				new MemurKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()
		};
		
		for(BaseKrediManager km: kredi) {
			System.out.println(km.hesapla(1000));
		}
		
	}

}
