package acm321w4;
import java.util.Scanner;
public class exe6 {

public static void main(String[] args) {
	char ch;
	do {
	System.out.println("enter a number: ");
	Scanner sc=new Scanner(System.in);
	double x= sc.nextDouble();
	
	double f=0.00;
	if(x<=0)
		f=Math.pow(x, 2)+1;
	if(x>=1) 
		f=x;
	if(x>0 && x<1)
		f=Math.sqrt(x);
	System.out.println("F= "+f);
	System.out.println("Do you want to continue? (Y/N): ");
	ch=sc.next().charAt(0);
	if(ch=='n' || ch=='N')
		break;
	}
	while(1!=0);
		
	}
}







