package whileDongusu;

public class whileDongusu {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<10){
			System.out.print(i + " ");
			i+=2;
		}
		System.out.println();
		int j = 0;
		while(j<10) {
			System.out.print(j + " ");
			j+=2;
		}
		System.out.println();
		int a = 0;
		while(a <10) {
			a++;
			if(a==6 || a==8)
				continue;
			System.out.print(a + " ");
		}
		System.out.println();
		int b = 0;
		int top = 0;
		while(b<10) {
			b++;
			top = top + b;
			if(b==10)
				break;
			System.out.print(top + " ");
		}
		
	}

}
