//this program takes names and shows their initials
package acm321w2;
import java.util.Scanner;
public class ınıtıals {

public static void main(String[] args) {
	
	Scanner tara= new Scanner(System.in);
	System.out.println("Enter your first name: ");
	String firstname=tara.next();
	
	System.out.println("Enter your second name: ");
	String secondname=tara.next();
	
	String initials= firstname.substring(0,1)+"&"+secondname.substring(0,1);
	System.out.println(initials);
	tara.close();
	}

}
