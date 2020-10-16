package tryCatch;

public class tryCatch {

	public static void main(String[] args) {
		
		try {
			int [] sayilar = new int[] {1, 2, 3};
			System.out.println(sayilar[5]);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String hatasi: " + e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array hatasi: " + e);
		}catch(Exception e) { //hangi hata gelirse gelsin yakalar. Ama ilk array hatasina girecegi icin calismaz.
				System.out.println("Genel hata: " + e);
		}finally {
			System.out.println("Ben turlu calisirim."); //bu satir program hata alsa da calisir.
		}

	}

}
