package udemyoop8;
import java.util.Scanner;
public class Matematik {

	private double pi= Math.PI;
	Scanner sc= new Scanner(System.in);

	public class Factorial {
//Matematik classının içinde Factorial classı oluşturduk
// Factorial classı Matematik classının inner classı
		
		public void faktoriyel() {
			System.out.println("Bir sayi giriniz: ");	
			int sayi1= sc.nextInt();
			int fact= 1;
			
			for(int i=2;i<= sayi1;i++) {
				fact *= i; 
			}
			
			System.out.println("Faktoriyel: "+fact);
		}
	}
	
	public class Asal{
		public boolean asalmi(int sayi) {
			int i=2;
			if(sayi<=1)
				return false;
			while(sayi<i) {
				if(sayi%i==0)
					return false;
				i++;
			}
			return true;
			
		}
	}
	
	public class Alan{
		public class Dairealan{
			public void dairealanhesap(int r) {
			System.out.println("Dairenin alani: "+(r*r* pi));
			}
		}
	}
		
/* pi değerini private olarak tanımladığımız için normalde Matematik.java hariç hiçbir class erişemiyor
fakat bu classı Matematik classının içine yazdığımız için yani bir inner class olduğu için erişebiliyoruz
inner classlar üst classlardan miras alıyor
*/
						
}
	
	
	

