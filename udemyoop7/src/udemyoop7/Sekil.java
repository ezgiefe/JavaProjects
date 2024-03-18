package udemyoop7;

	public abstract class Sekil {
//override edilmesine gerek olmayan ve abstract methodlar bulunuyor
	private String isim;

	public Sekil(String isim) {
	this.isim = isim;
	}
	public void isminisoyle() {
		System.out.println("Bu obje "+isim+" objesidir.");
	}
	
	abstract void alanhesapla();
//gövdesiz method
//alt sınıflar bu methodu yazmak zorundalar	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
}
