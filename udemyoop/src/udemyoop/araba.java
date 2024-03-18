package udemyoop;

public class araba {

	private String renk;
	private int kapilar;
	private int tekerlekler;
	private String motor;
	private String model;
	
	public void setModel(String model) {
		
		this.model= model; //this şu anki objemizi gösteriyor
							//model değilde modelasd gibi olsaydı this kullanmamaıza gerek olmayacaktı	
	}
	public String getModel() {
		return this.model; //this demesek de olur
	}
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public int getKapilar() {
		return kapilar;
	}
	public void setKapilar(int kapilar) {
		if(kapilar<0)
			System.out.println("kapi sayisi 0'dan kucuk olamaz.");	
		else
			this.kapilar= kapilar;
	}
	
	public int getTekerlekler() {
		return tekerlekler;
	}
	public void setTekerlekler(int tekerlekler) {
		this.tekerlekler = tekerlekler;
	}
	
}
