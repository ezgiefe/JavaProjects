package udemyoop6;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz");
		String sartlar= "Yurtdisi cikis kurallari\n"
				+ "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor\n"
				+ "15 TL harc bedelinizi tam olarak yatirmaniz gerekiyor\n"
				+ "gideceginiz ulkeye vizenizin bulunmasai gerekiyor";
		
		String message= "Yurtdisi sartlarindan hepsini saglamaniz gerekiyor.\n";
		
		while(true) {
			System.out.println("*********************");
			System.out.println(sartlar);
			System.out.println("*********************");

			yolcu yolcu1= new yolcu();
			
			System.out.println("Harc bedeli kontrol ediliyor...");
			Thread.sleep(3000);
			
			if(yolcu1.yurtdisiHarciKontrol()==false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Siyasi yasak kontrol ediliyor...");
			Thread.sleep(3000);
			
			if(yolcu1.siyasiYasakKontrol()==false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Vize durumu kontrol edliyor...");
			Thread.sleep(3000);
			
			if(yolcu1.vizeDurumuKontrol()==false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Islemleriniz tamamdir. Yurtdisina cikabilirsiniz.");
			break;
			
		}
	}

}
