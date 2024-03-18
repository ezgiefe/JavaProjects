package miniProjectUdmy;
import java.util.Scanner;
public class gelismisnothesaplama {

public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	
	System.out.print("Vize1: ");
	int vize1= sc.nextInt();
	
	System.out.print("Vize2: ");
	int vize2= sc.nextInt();
	
	System.out.print("Final: ");
	int finalnot= sc.nextInt();
	
	System.out.print("Okul ortalamaniz: ");
	double ort= sc.nextDouble();
	
	double toplam= (vize1 * 3/10.0)+
					(vize2 * 3/10.0) +
					(finalnot * 4/10.0);
	
	if(toplam >= 90)
		System.out.println("AA aldiziz...");
	else if(toplam >=85)
		System.out.println("BA aldiniz...");
	else if(toplam >=80)
		System.out.println("BB aldiniz...");
	else if(toplam >=75)
		System.out.println("BC aldiniz...");
	else if(toplam >=70)
		System.out.println("CC aldiniz...");
	else if(toplam >=65)
		System.out.println("DC aldiniz...");
	else if(toplam >=60) {
		System.out.println("DD aldiniz...");
		if(ort<2.50)
			System.out.println("Not ortalamaniz dusuk. "
					+ "Bu dersi tekrar almayi dusunebilirsiniz.");
	}
	else if(toplam >=55)
		System.out.println("FD aldiniz ve kaldiniz...");
	else
		System.out.println("FF aldiniz ve kaldiniz...");

	
	
	
	}

}
