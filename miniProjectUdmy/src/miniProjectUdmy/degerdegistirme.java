package miniProjectUdmy;
import java.util.Scanner;
public class degerdegistirme {

public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int ilksayi;
	int ikincisayi;
	
	System.out.println("Birinci sayi: ");
	ilksayi= sc.nextInt();
	
	System.out.println("Ikinci sayi: ");
	ikincisayi= sc.nextInt();
	
	System.out.println("degistirmeden once birinci sayi: "
			+ilksayi+" ikinci sayi: "+ikincisayi);
	
	int gecici= ilksayi;
	ilksayi= ikincisayi;
	ikincisayi= gecici;
	
	System.out.println("degistirmeden sonra birinci sayi: "
	+ilksayi+" ikinci sayi: "+ikincisayi);
	
			
	
	}

}
