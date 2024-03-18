package udemyoop4;

public class gelismisAbone {

	private String abisim;
	private int bakiye= 120; //bakiye değerini vermezsek 120den başlatılıcak
	private String sehir;
	
	public gelismisAbone(String isim, int bakiye, String sehir) {
		this.abisim=isim;
		
		if(this.bakiye >=0 && bakiye<= 120) 
			this.bakiye=bakiye;
		
		this.sehir=sehir;
	}
	
	public void dogalgazkullan(int miktar) {
		if((this.bakiye - miktar)<0)
			System.out.println("Yeterli bakiye yok.");
		else {
			this.bakiye -= miktar;
			if(this.bakiye <= 0)
				System.out.println("Bakiyeniz bitmistir. \nLutfen en yakin abone merkezine giderek kredi yukleyin.\n"
						+ "Kredi Limiti= 120TL");
			else 
				System.out.println("Yeni bakiye= "+bakiye);
		}
	}
	
	public void bakiyeogren() {
		System.out.println("Bakiyeniz= "+ bakiye );
	}
}
