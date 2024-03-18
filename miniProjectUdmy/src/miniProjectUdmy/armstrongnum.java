package miniProjectUdmy;
import java.util.Scanner;
public class armstrongnum {

public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Sayiyi giriniz: ");
	int sayi= sc.nextInt();
	System.out.println("Basamak sayisi:");
	int basamak= sc.nextInt();
	
	int gecici= sayi;
	int toplam= 0;
	
	do {
		int basamakdegeri= gecici %10;
		gecici /=10;
		
		toplam+= Math.pow(basamakdegeri, basamak);	
	}
	
	while(gecici>0);
	
	if(sayi==toplam) 
		System.out.println("Bu sayi armstrong sayisidir.");
	else
		System.out.println("Bu sayi armstrong sayisi degildir.");
	}

}
