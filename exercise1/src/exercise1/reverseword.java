package exercise1;
import java.util.Scanner;
public class reverseword {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the word: ");
String word= sc.nextLine();

char[] letters = word.toCharArray();
String reversedword= "";

for(int i= letters.length-1;i>=0;i-- ) {
	reversedword += letters[i]; 
}
System.out.println(reversedword);
	
	
	
	}

}
