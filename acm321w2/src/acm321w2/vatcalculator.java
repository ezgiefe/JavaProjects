package acm321w2;
import java.util.Scanner;
public class vatcalculator {

public static void main(String[] args) {
	
	Scanner tara=new Scanner(System.in);
	System.out.println("Enter a product name: ");
	String product=tara.nextLine();
	
	System.out.println("Enter a price: ");
	float price=tara.nextFloat();
	
	float tf;
	tf=(float)(price*1.18);
	//float degeri verirken parantez icine float yazman gerek
	
	System.out.println(product+"'s VAT included price is: "+tf);
	
	tara.close();
	
	
	
	
	
	
	
	}

}
