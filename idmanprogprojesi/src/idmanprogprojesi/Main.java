package idmanprogprojesi;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	System.out.println("Idman programina hosgeldiniz...");
	
	String idmanlar= "Gecerli hareketler...\n"
			+ "Burpee\n"
			+ "Pushup\n"
			+ "Situp\n"
			+ "Squat\n";
	System.out.println(idmanlar);
	
	System.out.println("Bir idman oluşturun...");
	
	System.out.println("Burpee sayisi: ");
	int burpee= sc.nextInt();
	
	System.out.println("Pushup sayisi: ");
	int pushup= sc.nextInt();
	
	System.out.println("Situp sayisi: ");
	int situp= sc.nextInt();
	
	System.out.println("Squat sayisi: ");
	int squat= sc.nextInt();
	sc.nextLine();
	
	Idman idman= new Idman(burpee ,pushup, situp,squat );
	
	System.out.println("Idmaniniz basliyor...");
	
	while(idman.idmanbittimi()==false) {
		
		System.out.println("Hareket turu(burpee, pushup, situp, squat): ");
		String tur= sc.nextLine();
		
		System.out.println("Tekrar sayisi: ");
		int sayi= sc.nextInt();
		sc.nextLine();
		
		idman.hareketyap(tur, sayi);
		
	}
	System.out.println("Idmanini basariyla tamamladin...");
	



}

}
