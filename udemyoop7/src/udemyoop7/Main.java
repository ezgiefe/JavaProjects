package udemyoop7;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		Sekil skll= new Sekil("Sekil");
// abstarct classlardan obje oluşturamıyoruz
		/*Kare kr= new Kare("SpungeBob", 5);
		Daire dr= new Daire("Donut", 3); */
		Scanner sc= new Scanner(System.in);
		Sekil sk= null;
		
		String islemler= "Islemler...\n"
				+ "1. Kare alan hesaplama\n"
				+ "2. Ucgen alan hesaplama\n"
				+ "3. Daire alan hesaplama\n"
				+ "Cikis icin q'ya basin.";
		
		while(true) {
			System.out.println(islemler);
			System.out.println("Hangi seklin alanini hesaplamak istiyorsunuz?");
			
			String sekiltur= sc.nextLine();
			
			if(sekiltur.equals("q")) {
				System.out.println("Programdan cikis yapiliyor...");
				break;
			}
			else if(sekiltur.equals("1")) {
				System.out.println("Karenin kenari: ");
				int kenar= sc.nextInt();
				sc.nextLine();
				
				sk= new Kare("kare1", kenar);
				sk.alanhesapla();
			}
			else if(sekiltur.equals("2")) {
				System.out.println("1. kenari giriniz: ");
				int akenar= sc.nextInt();
				System.out.println("2. kenari giriniz: ");
				int bkenar= sc.nextInt();
				System.out.println("3. kenari giriniz: ");
				int ckenar= sc.nextInt();
				sc.nextLine();
				
				sk= new Ucgen("ucgen1",akenar,bkenar,ckenar);
				sk.alanhesapla();
			}
			else if(sekiltur.equals("3")) {
				System.out.println("Yaricapi giriniz: ");
				int yaricap= sc.nextInt();
				sc.nextLine();
				
				sk= new Daire("daire1",yaricap);
				sk.alanhesapla();
			}
			else
				System.out.println("Gecersiz islem...");
			
			
		}
		
		
	}

}
