package udemyoop;
import java.util.Scanner;
public class Login {

	public boolean login(Hesap hesap) {
		Scanner sc= new Scanner(System.in);
		String kullaniciadi;
		String parola;
		
		System.out.println("Kullanici adi: ");
		kullaniciadi= sc.nextLine();
		System.out.println("Parola: ");
		parola= sc.nextLine();
		
		if(hesap.getKullaniciadi().equals(kullaniciadi) && hesap.getParola().equals(parola)) 
			return true;
		else 
			return false;
	}
}
