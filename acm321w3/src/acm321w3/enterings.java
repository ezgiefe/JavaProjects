package acm321w3;
import java.util.Scanner;
public class enterings {

public static void main(String[] args) {

	Scanner myobject=new Scanner(System.in);
	System.out.println("Enter username: ");
	String username= myobject.next();
	System.out.println("Username is: "+username);
	
	
	Scanner myint= new Scanner(System.in);
	System.out.println("Enter your password: ");
	long password=myint.nextLong();
	System.out.println("Password is: "+password);
	
	}

}
