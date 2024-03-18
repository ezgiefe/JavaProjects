package udemyoop3;

public class Monitor {

	private String model;
	private String uretici;
	private String boyut;
	private Resolution resolution;
//Resolution objesinden bir obje kullanmak istediğimizi yazdık
//Composition 
	
	public Monitor(String model, String uretici, String boyut, Resolution resolution) {
		this.boyut=boyut;
		this.model=model;
		this.resolution=resolution;
		this.uretici=uretici;
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

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	public void monitorukapat() {
		System.out.println("Monitor kapatiliyor...");
	}
	
	
}
