package udemyoop7;

public class Kare extends Sekil {

	private int kenar;
	
	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar=kenar;
	}

	@Override
	void alanhesapla() {
		System.out.println(getIsim()+" alani "+(kenar*kenar)+"dir.");	
	}

	
}
