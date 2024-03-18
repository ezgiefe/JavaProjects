package miniProjectUdmy;
import java.util.Scanner;
public class atmprogrami {

public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int bakiye= 1000;
	String islemler= "1. Islem: Bakiye Ogrenme\n"
			+ "2. Islem: PAra Cekme\n"
			+ "3. Islem: Pata Yatirma\n"
			+ "Cikis icin q'ya basin.";
	System.out.println("***********************");
	System.out.println(islemler);
	System.out.println("***********************");

	while(true) {
		
		System.out.println("Islemi seciniz: ");
		String islem= sc.nextLine();
		
		if (islem.equals("q")) {
			System.out.println("Programdan Cikiliyor...");
			break; 		}
		
		else if(islem.equals("1")) 
			System.out.println("Bakiyeniz: "+bakiye);
		
		else if(islem.equals("2")) {
			System.out.print("Cekmek istediginiz tutar: ");
			int tutar= sc.nextInt();
			sc.nextLine();
			
			if(bakiye- tutar<0)
				System.out.println("Yeterli bakiye yok. Bakiyeniz: "+bakiye);
			else {
				bakiye -= tutar;
				System.out.println("Yeni Bakiyeniz: "+bakiye);		}
		}
		
		else if(islem.equals("3")) {
			System.out.println("Yatirmak istediginiz tutar:");
			int tutar= sc.nextInt();
			sc.nextLine();
			
			bakiye+= tutar;
			System.out.println("Yeni Bakiyeniz: "+bakiye);		
		}
		
		else 
			System.out.println("Gecersiz islem.");	
		
	}
	
	
	}

}
