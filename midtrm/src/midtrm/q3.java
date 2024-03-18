package midtrm;
import java.util.Scanner;

public class q3 {

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a string: ");
	String word= sc.nextLine();	
	System.out.println(" : "+ isAllConsonants(word));
	}
	

	public static boolean isAllConsonants(String word) {
	    for(int i=0;i<word.length();i++) {
	        char ch = Character.toUpperCase(word.charAt(i));
	        if (ch >= 'A' && ch <= 'Z' && ch != 'Z' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
	            continue;
	        } else {
	            return false;
	        }
	    }
	    return true;
	}



}


