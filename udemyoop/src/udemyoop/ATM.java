package udemyoop;
import java.util.Scanner;
public class ATM {

public void calis(Hesap hesap) {
		
	Login login= new Login();
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Bankamiza hosgeldiniz...");
	
	System.out.println("******************************");
	System.out.println("Kullanici girisi");
	System.out.println("******************************");

	int girishakki= 3;
	
	while(true) {
		if(login.login(hesap)) {
			System.out.println("Giris basarilidir...");
			break;
		}
		else {
			System.out.println("Giris basarisizdir...");
			girishakki-=1;
			System.out.println("Kalan giris hakki: "+girishakki);
		}
		if(girishakki==0) {
			System.out.println("Giris hakkiniz bitti...");
			return;
			//break dersek sadece döngü sonlanıcak ama methodun sonlanması lazım
			//o yüzden return kullandık
		}
		
	} 
	
	System.out.println("************************");
	String islemler= "1. Bakiye Goruntule\n"
			+ "2. Para Yatirma\n"
			+ "3. Para Cekme\n"
			+ "4. Cikis icin 'q' ya basin";
	System.out.println(islemler);
	System.out.println("************************");

	while(true) {
		System.out.println("Islemi seciniz: ");
		String islem= sc.nextLine();
		
		if(islem.equals("q"))
			break;
		else if(islem.equals("1")) 
			System.out.println("Bakiyeniz: "+hesap.getBakiye());
		
		else if(islem.equals("2")) {
			System.out.println("Yatirmak istediginiz tutar: ");
			int tutar= sc.nextInt();
			sc.nextLine();
			
			hesap.parayatir(tutar);
		}
		else if(islem.equals("3")) {
			System.out.println("Cekmek istediginiz tutar: ");
			int tutar= sc.nextInt();
			sc.nextLine();
			
			hesap.paracekme(tutar);
		}
		else
			System.out.println("Gecersiz islem...");
	}
	
	}
}
