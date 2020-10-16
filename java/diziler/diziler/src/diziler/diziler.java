package diziler;

public class diziler {

	public static void main(String[] args) {
		/*
		 
		 int [] A = new int[6];	
		 int A [] = new int[6];
		 
		 int A[]; 
		 A = new int[6];
		
		 int N = 6;
		 int A[] = new int[N];
		 
		 int A[] = {8, 9, 10, 11, 12, 13};
		 
		 char A[] = new char[3];
		 char A[] = {'A', 'B', 'C'};
		 
		 String gun[] = new String[5];
		 String gun[] = {"pzt", "sali", "crs", "prs", "cuma"};
		 */
		
		String [] ogrenciler = new String[3];
		ogrenciler[0] = "Beyza";
		ogrenciler[1] = "Mert";
		ogrenciler[2] = "Ahmet";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println();
		for(String ogrenci:ogrenciler) { 
			System.out.println(ogrenci);
		}
	}

}
