package miniProjectUdmy;
import java.util.Scanner;
public class kullanicigirisi {

public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int girishakki= 3;
	String sys_kullaniciadi= "Ezgi Efe";
	String sys_parola= "1234";
	
	System.out.println("*******************");
	System.out.println("Kullaici girisine hosgeldiniz");
	System.out.println("*******************");

	while(true) {
		if(girishakki==0) {
			System.out.println("Giris hakkiniz bitmistir.");
			break;	}
		
		System.out.println("Kullanici Adi: ");
		String kullanici= sc.nextLine();
		System.out.println("Parola: ");
		String parola= sc.nextLine();
		
		if(kullanici.equals(sys_kullaniciadi) && parola.equals(sys_parola)) {
			System.out.println("Hosgeldiniz "+kullanici);
		break;	}
		
		else if(kullanici.equals(sys_kullaniciadi)&& !parola.equals(sys_parola)) {
			System.out.println("Parolaniz yalnis...");
			girishakki-=1;	 }
		
		else if(!kullanici.equals(sys_kullaniciadi)&& parola.equals(sys_parola)) {
			System.out.println("Kullanici adiniz yanlis...");
			girishakki-=1;	 }
		
		else {
			System.out.println("Kullanici adiniz ve parolaniz yanlis...");
			girishakki-=1;	}

	}
	
	}

}
