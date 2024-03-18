package udemyoop5;

public class Bayblade {

	private String baybladeci;
	private int donushizi;
	private int saldirigucu;
	
	public Bayblade(String baybladeci, int donushizi, int saldirigucu) {
		this.setBaybladeci(baybladeci);
		this.setDonushizi(donushizi);
		this.setSaldirigucu(saldirigucu);
	}

	public String getBaybladeci() {
		return baybladeci;
	}

	public void setBaybladeci(String baybladeci) {
		this.baybladeci = baybladeci;
	}

	public int getDonushizi() {
		return donushizi;
	}

	public void setDonushizi(int donushizi) {
		this.donushizi = donushizi;
	}

	public int getSaldirigucu() {
		return saldirigucu;
	}

	public void setSaldirigucu(int saldirigucu) {
		this.saldirigucu = saldirigucu;
	}
	
	public void saldir() {
		System.out.println(baybladeci+" "+ saldirigucu+" ve "+ donushizi+ " ile saldiriyor");
	}
	
	public void kutsalcanavarcıkıs() {
		System.out.println("Bu baybladein kutsal canavari yok");
	}
	
	public void bilgilerigoster() {
		System.out.println("Baybladeci ismi: "+ baybladeci);
		System.out.println("Saldiri gucu: "+saldirigucu);
		System.out.println("Donus Hizi: "+donushizi);
	}

}
