package acm321w3;
import java.util.Scanner;
public class findthechar {

public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a character: ");
	char x=sc.next().charAt(0);
	
	if(x=='a' || x=='e' || x=='i' || x=='u' || x=='o')
		System.out.println(x+" is a wovel.");
	else 
		System.out.println(x+" is a consonant.");
	}

}

/*
Scanner scnr= new Scanner(System.in);
		System.out.println("Enter your character: ");
		char a=scnr.next().charAt(0); //character input

		switch(a) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println(a+" is a wovel");
		break;
		default:
			System.out.println(a+" is a consonant");
*/
