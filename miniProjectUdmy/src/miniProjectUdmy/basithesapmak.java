package miniProjectUdmy;
import java.util.Scanner;
public class basithesapmak {

public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
		
	String islemler= "1. Toplama\n"
					+ "2. Cikarma\n"
					+ "3. Carpma\n"
					+ "4. Bolme";
	System.out.println(islemler);
	System.out.println("*********************");
	System.out.println("Islemi seciniz: ");
	String islem= sc.nextLine();
	int a, b;
	switch(islem) {
	case "1":
		System.out.println("Birinci sayi: ");
		a = sc.nextInt();
		System.out.println("Ikinci sayi: ");
		b = sc.nextInt();
		System.out.println("Toplama sonucu: "+(a+b));
		break;
		
	case "2":
		System.out.println("Birinci sayi: ");
		a = sc.nextInt();
		System.out.println("Ikinci sayi: ");
		b = sc.nextInt();
		System.out.println("Cikarma sonucu: "+(a-b));
		break;
		
	case "3":
		System.out.println("Birinci sayi: ");
		a = sc.nextInt();
		System.out.println("Ikinci sayi: ");
		b = sc.nextInt();
		System.out.println("Carpma sonucu: "+(a*b));
		break;
		
	case "4":
		System.out.println("Birinci sayi: ");
		a = sc.nextInt();
		System.out.println("Ikinci sayi: ");
		b = sc.nextInt();
		System.out.println("Bolme sonucu: "+((double)a/b));
		break;
	
	default:
		System.out.println("Gecersiz islem");
	}
			
	
	}

}
