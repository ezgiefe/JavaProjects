package udemyoop7;

public class Seyirci {

	private String isim;
	
	private static int seyircisay =0;
	//bu classa özgü, 
	

	public Seyirci(String isim) {
		super();
		this.isim = isim;
		seyircisay++;
	//her bir obje oluşturulduğunda seyircisay bir artıcak	
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void oyunseyret() {
		System.out.println(isim+" Oyun seyrediyor...");
	}
	public int getseyircisay() {
		return seyircisay;
	}
	
	
}
