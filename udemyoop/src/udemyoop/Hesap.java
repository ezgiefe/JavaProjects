package udemyoop;

public class Hesap {

	private String kullaniciadi;
	private String parola;
	private int bakiye;
	
	public Hesap(String kullaniciadi, String parola, int bakiye) {
		this.setKullaniciadi(kullaniciadi);
		this.setParola(parola);
		this.setBakiye(bakiye);
	}

	public String getKullaniciadi() {
		return kullaniciadi;
	}

	public void setKullaniciadi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	
	public void parayatir(int tutar) {
		bakiye+=tutar;
		System.out.println("Yeni bakiyeniz= "+bakiye);
	}
	
	public void paracekme(int tutar) {
		if(bakiye-tutar<0)
			System.out.println("Yetersiz bakiye...");
		else {
			bakiye -=tutar;
			System.out.println("Yeni bakiyeniz= "+bakiye);
			}
	}
	
	
	
}
