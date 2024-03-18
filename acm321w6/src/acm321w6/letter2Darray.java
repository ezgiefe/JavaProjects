package acm321w6;
//print 'X'
public class letter2Darray {

public static void main(String[] args) {
char[][]array=new char[11][7];
for(int i=0;i<11;i++) {
	for(int j=0;j<7;j++) {
		if(j==0 || (j+i==6 && i<6)||(i>5 && i-j==4))
			array[i][j]='*';
		else
			array[i][j]=' ';
		System.out.print(array[i][j]);
	}
	System.out.println(" ");
}		

	}

}
