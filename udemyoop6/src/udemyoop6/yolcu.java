package udemyoop6;
import java.util.Scanner;
public class yolcu implements yurtdisikurallari {

	private int harc;
	private boolean siyasiyasak;
	private boolean vizedurumu;
	
	public yolcu() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Yatirdiginiz harc bedeli: ");
		this.harc= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Herhangi bir siyasi yasaginiz bulunuyor mu? (evet ya da hayir)");
		String cevap= sc.nextLine();
		
		if(cevap.equals("evet")) {
			this.siyasiyasak= true;
		}
		else {
			this.siyasiyasak=false;
		}
		System.out.println("Vizeniz var mi? (evet ya da hayir)");
		String cevap2= sc.nextLine();
		
		if(cevap2.equals("evet")) {
			this.vizedurumu=true;
		}
		else {
			this.vizedurumu=false;
		}
	}
	
	public boolean yurtdisiHarciKontrol() {
		if(this.harc <15) {
			System.out.println("Lutfen yurtdisi harcini tam yatirin.");
			return false;
		}
		else {
			System.out.println("Yurtdisi harci islemi tamamdir.");
			return true;
		}
	}
	
	public boolean siyasiYasakKontrol() {
		if(this.siyasiyasak== true) {
			System.out.println("Siyasi yasaginiz bulunuyor. Yurtdisina cikamazsiniz.");
			return false;
		}
		else {
			System.out.println("Siyasi yasaginiz yok.");
			return true;
		}
	}
	public boolean vizeDurumuKontrol() {
		if(this.vizedurumu==true) {
			System.out.println("Vize durumu tamamdir.");
			return true;
		}
		else {
			System.out.println("vizeniz gideceginiz yere bulunmamaktadir.");
			return false;
		}
	}
	
	
}
