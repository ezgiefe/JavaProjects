package miniproject;

public class Yazilimci extends Calisan{

	private String diller;
	
	public Yazilimci(String ad, String soyad, int id, String diller) {
		super(ad, soyad, id);
		this.diller=diller;
	}
	
	public void formatat(String isletimsys) {
		System.out.println(getAd()+ " "+isletimsys+"'ni yukluyor...");
	}
	
	public void bilgilerigoster() {
		
		super.bilgilerigoster();
		System.out.println("Yazilimcinin bildigi diller: "+ diller);
		
	}

	
}
