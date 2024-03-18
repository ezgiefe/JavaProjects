package midtrm;

public class q2 {

public static void main(String[] args) {

	char [][] A=new char[20][20];
	for(int row=0;row<20;row++) {
		
		for(int col=0;col<20;col++) {
			
			if((row==col && col<5) || (col>5 && row<5 && row+col==10))
				A[row][col]='*';
			else
				A[row][col]=' ';
			System.out.print(A[row][col]);
		}
		System.out.print("\n");
	}
	
	}

}
