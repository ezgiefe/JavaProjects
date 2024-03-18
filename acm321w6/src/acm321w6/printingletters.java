package acm321w6;
//print 'G'
public class printingletters {

public static void main(String[] args) {
for(int i=0;i<9;i++) {
		
	for(int j=0;j<9;j++) {
		if(j==0 || i==8 || i==0) 
			System.out.print("*");
		else if(i>4 && j==8 || i==4 && j>4 )
			System.out.print("*");
		else
			System.out.print(" ");
	}
System.out.print("\n");
}
} }
