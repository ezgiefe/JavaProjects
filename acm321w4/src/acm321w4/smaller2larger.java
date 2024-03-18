package acm321w4;
import java.util.Scanner;
public class smaller2larger {

public static void main(String[] args) {

	int a,b,c;
	Scanner input= new Scanner(System.in);
	System.out.println("Enter two number: ");
	a=input.nextInt();
	b=input.nextInt();
	
	if(a>b) {
		c=a;
		a=b;
		b=c;
	}
	
	System.out.print("Order "+a+ '\t'+b);
	
	}

}
