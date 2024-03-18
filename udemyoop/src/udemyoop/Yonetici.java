package udemyoop;
// bu class Subclass
public class Yonetici extends Calisan {
/* extends yazdığımızda ben Calisan classının bütün özelliklerini 
 * ve methodlarını miras almak istiyorum demiş oluyoruz.
 */

	private int sorumlukisi; //ekstra özellik
	
	public Yonetici(String isim, int maas, String departman, int sorumlukisi) {
//this kullandığımızda da private olarak değerleri ayarladığımız için sorun alıyoruz
		//miras aldığım classın constractorını kullanmak istiyorum diyoruz altta
		super(isim, maas, departman);
		
		this.sorumlukisi= sorumlukisi;	
	}

	public void zamyap(int zammiktari) {
		System.out.println("Calisana "+zammiktari+"TL zam yapildi.");
		int maass= getMaas();
		maass += zammiktari;
		this.setMaas(maass);
		System.out.println("Yeni maas: "+getMaas());

	}

	public void bilgilerigoster() {
	/*  System.out.println("Isim: "+getIsim());
		System.out.println("Maas: "+getMaas());
		System.out.println("Departman: "+getDepartman());
yukarıdaki gibi de yazabilirdik fakat alttaki method daha mantıklı		
		*/
		super.bilgilerigoster();
		
		
		System.out.println("Sorumlu kisi sayisi: "+this.sorumlukisi);
		
	}




}
