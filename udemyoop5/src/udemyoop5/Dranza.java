package udemyoop5;

public class Dranza extends Bayblade{

	private String kutsalcanavar;
	
	public Dranza(String baybladeci, int donushizi, int saldirigucu, String kutsalcanavar) {
		super(baybladeci, donushizi, saldirigucu);
		this.setKutsalcanavar(kutsalcanavar);
	}

	public String getKutsalcanavar() {
		return kutsalcanavar;
	}

	public void setKutsalcanavar(String kutsalcanavar) {
		this.kutsalcanavar = kutsalcanavar;
	}
	
	public void bilgilerigoster() {
		super.bilgilerigoster();
		System.out.println("Kutsal canavarin adi: "+kutsalcanavar);
	}
	
	public void kutsalcanavarcıkıs() {
		System.out.println(getBaybladeci()+" "+ kutsalcanavar+" ı ortaya cikariyor...");		
	}
	
	
}
