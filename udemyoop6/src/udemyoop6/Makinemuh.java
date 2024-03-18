package udemyoop6;

public class Makinemuh implements Imuhendis, Icalisma {
//birden fazla interface implement ettik
	private boolean askerlik;
	private boolean adlisicil;
	
	public Makinemuh(boolean askerlik, boolean adlisicil) {
		this.adlisicil=adlisicil;
		this.askerlik=askerlik;
	}
	
	public void askerliksorgula() {
		if(askerlik)
			System.out.println("askerligimi yaptim.");
		else
			System.out.println("askerligimi henuz yapmadim.");
	}
	
	public String mezuniyetort(double derece) {
		return "Ortalamam: "+derece;
	}
	
	public void adlisicilsorgula() {
		if(adlisicil)
			System.out.println("adli sicil kaydim bulunuyor");
		else
			System.out.println("adli sicil kaydim yok.");
	}
	
	public void istecrubesi(String[] array) {
		
		if(array.length == 0)
			System.out.println("Herhangi bir is tecrubem yok.");
		else {
			System.out.println("Makine muhendisi olarak su sirketlerde calistim: ");
			for(int i=0;i< array.length;i++) {
				System.out.println(array[i]);
			}
		}
	}
	
	public void referansgetir(String[] array) {
		if(array.length==0)
			System.out.println("Herhangi bir referansim yok.");
		else {
			System.out.println("Referanslarım: ");
			for(int i=0;i< array.length;i++) {
				System.out.println(array[i]);
			}
		}
	}
	
	public void calis() {
		System.out.println("Makine muhendisi calisiyor...");
	}
	
	
}
