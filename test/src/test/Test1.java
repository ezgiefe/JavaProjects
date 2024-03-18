package test;
import java.util.Scanner;

public class Test1 {
// bütün classları aynı yere yazarken main class hariç public olarak tanımlayamazsın
 
	public static void main(String[] args) {

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
	
	abstract class Sekil {
		//override edilmesine gerek olmayan ve abstract methodlar bulunuyor
			private String isim;

			public Sekil(String isim) {
			this.isim = isim;
			}
			public void isminisoyle() {
				System.out.println("Bu obje "+isim+" objesidir.");
			}
			
			abstract void alanhesapla();
		//gövdesiz method
		//alt sınıflar bu methodu yazmak zorundalar	
			
			public String getIsim() {
				return isim;
			}
			public void setIsim(String isim) {
				this.isim = isim;
			}
	}
	
	class Kare extends Sekil {

		private int kenar;
		
		public Kare(String isim, int kenar) {
			super(isim);
			this.kenar=kenar;
		}

		@Override
		void alanhesapla() {
			System.out.println(getIsim()+" alani "+(kenar*kenar)+"dir.");	
		}	
	}
	
	class Daire extends Sekil{

		private int yaricap;
		
		public Daire(String isim, int yaricap) {
			super(isim);
			this.yaricap=yaricap;
		}
		
		@Override
		void alanhesapla() {
			System.out.println(getIsim()+" alani "+ (Math.PI * yaricap * yaricap));
		}	
	}
	
	class Ucgen extends Sekil {

		private int a;
		private int b;
		private int c;
		public Ucgen(String isim, int a, int b, int c) {
			super(isim);
			this.a = a;
			this.b = b;
			this.c = c;
		}
		@Override
		void alanhesapla() {
			double u= (a+b+c)/ 2.0;
			double alan= Math.sqrt(u * (u-a)* (u-b)*(u-c));
			System.out.println(getIsim()+" nin alani "+alan);
		}
	}
	

