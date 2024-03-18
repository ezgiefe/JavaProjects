package udemyoop2;

public class Kopek extends Hayvan {

	private int dissayisi;
	
	public Kopek(String isim, int kilo, int boy, int bacaksayisi, int dissayisi) {
		super(isim, kilo, boy,bacaksayisi);
		this.setDissayisi(dissayisi);
	}

	public int getDissayisi() {
		return dissayisi;
	}

	public void setDissayisi(int dissayisi) {
		this.dissayisi = dissayisi;
	}
	
	public void hareketegec(int hiz) {
		System.out.println("Kopek "+hiz+" ile hareket ediyor.");
	}
	
	public void kos(int hiz) {
		System.out.println("Kopek kosuyor...");
		hareketegec(hiz);
/*super.hareketegec olarak yazsaydık override ettiğimizi değil
hayvan classındaki method çalışıyor. yukarıdaki gib yazdığımızda override ettiğimiz çalışıyor */		
	}
	
}
