package udemyoop4;
//doğalgaz abonesi
public class Abone {

	public String isim;
	public int bakiye;
	public String sehir;
//encapsulationa aykırı public olarak tanımlamamız	
	
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
