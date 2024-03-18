package miniproject;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Calisanlar programina hosgeldiniz...");
		String islemler= "Islemler...\n"
				+ "1. Yazilimci islemleri\n"
				+ "2. Yonetici islemleri\n"
				+ "3. Cikis icin q'ya basin.";
		
		System.out.println("***********************");
		System.out.println(islemler);
		
		while(true) {
			System.out.println("Islemi seciniz: ");
			String islem= sc.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan cikiliyor...");
				break;
			}
			else if(islem.equals("1")) {
				Yazilimci yazilimci1= new Yazilimci("Ezgi", "efe", 965,"python, java,C");
				String yazilimciislem= "1. Format at\n"
							+ "2. Bilgileri goster\n"
							+ "Cikis icin q'ya basin";
					System.out.println(yazilimciislem);
					
				while(true) {
					System.out.println("islemi seciniz:");
					String yislem= sc.nextLine();
					
					if(yislem.equals("q")) {
						System.out.println("Yazilimci islemlerinden cikiliyor...");
						break;
					}
					else if(yislem.equals("1")) {
						System.out.println("Isletim sistemi:");
						String isletimsistemi= sc.nextLine();
						yazilimci1.formatat(isletimsistemi);
					}
					else if(yislem.equals("2")) {
						yazilimci1.bilgilerigoster();
					}
					else
						System.out.println("Gecersiz yazilimci islemi...");
				}
			}
			else if(islem.equals("2")) {
				Yonetici yonetici1= new Yonetici("Doga","Alkan",345,10);
				
				String yoneticiislem="Yonetici islemleri...\n"
						+ "1. Zam yap\n"
						+ "2.Bilgileri goster\n"
						+ "Cikis icin q'ya basin.";
				System.out.println(yoneticiislem);
				
				while(true) {
					System.out.println("Islemi seciniz: ");
					String yoislem=sc.nextLine();
					
					if(yoislem.equals("q")) {
						System.out.println("Yonetici islemlerinden cikis yapiliyor...");
						break;
					}
					else if(yoislem.equals("1")) {
						System.out.println("Zam miktarini giriniz: ");
						int zammiktari= sc.nextInt();
						sc.nextLine();
						yonetici1.zamyap(zammiktari);
					}
					else if(yoislem.equals("2")) {
						yonetici1.bilgilerigoster();
					}
					else
						System.out.println("Gecersiz yonetici islemi...");
				}
			}
			else
				System.out.println("Gecersiz islem...");
		}		
	}

}
