package udemyoop3;

public class Anakart {

	private String model;
	private String uretici;
	private int yuvasayisi;
	private String isletimsys;
	
	public Anakart(String model, String uretici, int yuvasayisi, String isletimsys) {
		this.isletimsys=isletimsys;
		this.model=model;
		this.uretici=uretici;
		this.yuvasayisi=yuvasayisi;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public int getYuvasayisi() {
		return yuvasayisi;
	}

	public void setYuvasayisi(int yuvasayisi) {
		this.yuvasayisi = yuvasayisi;
	}

	public String getIsletimsys() {
		return isletimsys;
	}

	public void setIsletimsys(String isletimsys) {
		this.isletimsys = isletimsys;
	}
	
	public void isletimsysyukle(String isletimsys) {
		this.isletimsys=isletimsys;
		System.out.println("Isletim sistemi yukendi: "+isletimsys);
	}
	
	
	
	
	
	
	
}
