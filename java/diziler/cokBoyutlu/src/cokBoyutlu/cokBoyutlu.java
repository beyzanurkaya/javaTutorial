package cokBoyutlu;

public class cokBoyutlu {

	public static void main(String[] args) {
		/*
		char arr [][] = new char[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j || i+j==4) 
					arr[i][j] = '*';
				else 
					arr[i][j] = ' ';
				
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		*/
		int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int B[][] = new int[3][3];
		System.out.println("A Dizisi");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(A[i][j]);
			}System.out.println();
		}
		
		System.out.println("A Dizisinin Tranzpozu");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				B[i][j] = A[j][i];
				System.out.print(B[i][j]);
			}System.out.println();
		}
		
		
	}

}
