package miniproject;

public class Yonetici extends Calisan{

	private int soumlukisisay;

	public Yonetici(String ad, String soyad, int id, int sorumlukisisay) {
		super(ad, soyad, id);
		this.soumlukisisay=sorumlukisisay;
	}
	public void bilgilerigoster() {
		super.bilgilerigoster();
		System.out.println("Yoneticinin sorumlu oldugu kisi sayisi: "+soumlukisisay);
		
	}
	
	public void zamyap(int zammiktari) {
		System.out.println(getAd()+" calisanlara "+zammiktari+" kadar zam yapiliyor...");
		
	}

	
}
