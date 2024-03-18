//Let's write a java program that decides input integer even or odd
package acm321w2;
import java.util.Scanner;
public class evenORodd {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number: ");
	int a=sc.nextInt();
	if(a%2==0)
		System.out.println("The number "+a+" is even.");
	else
		System.out.println("The number "+a+" is odd.");
	sc.close();
	
		
		
		
		
		
		
	}

}
