package udemyoop8;
// inner classlar
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		Factorial fact;
//Factorial Matematik classının içinde olduğu için göremiyor 
//ilk önce Matematik classından çağırmamız lazım		
		
		Matematik.Factorial fact= new Matematik().new Factorial();
		Matematik.Asal as= new Matematik().new Asal();
//		Matematik.Alan al= new Matematik().new Alan();
//inner classların objelerini bu şekilde oluşturuyoruz	
		Matematik.Alan.Dairealan dralan= new Matematik().new Alan().new Dairealan();
		
		Scanner sc= new Scanner(System.in);	
		
		System.out.println("Bir tane sayi giriniz: ");
		int sayi= sc.nextInt();
		
		if(as.asalmi(sayi))
			System.out.println("Bu sayi asaldir.");
		else
			System.out.println("Bu sayi asal degildir.");
			
		fact.faktoriyel();
//		al.dairealanhesap(5);
		dralan.dairealanhesap(6);
		
	}

}
