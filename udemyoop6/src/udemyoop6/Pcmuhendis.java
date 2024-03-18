package udemyoop6;

public class Pcmuhendis implements Imuhendis {

	private boolean askerlik;
	private boolean adlisicil;
	
	public Pcmuhendis(boolean askerlik, boolean adlisicil) {
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
		System.out.println("bilgisayar muh. olarak su sirketlerle calistim:");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
}
