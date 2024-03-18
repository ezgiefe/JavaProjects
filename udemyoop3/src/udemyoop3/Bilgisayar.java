package udemyoop3;

public class Bilgisayar {

	private Monitor monitor;
	private Kasa kasa;
	private Anakart anakart;
	
/* Composition "has a" yani bu obje şu objeye sahiptir ilişkisini kurar
 * inheritance kullanamayız çünkü kasa ve monitor bilgisayar değil bilgisayarın bileşenleri
   inheritance'ı bir şirketin çalışanlarını oluştururken kullanabiliriz 
   çünkü şirketin çalışanları şirketin bir parçasıdır, şirketteki herkes bir çalışandır sadece farklı görevleri vardır
 */

	public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) {
		this.anakart=anakart;
		this.kasa=kasa;
		this.monitor=monitor;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Kasa getKasa() {
		return kasa;
	}

	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}

	public Anakart getAnakart() {
		return anakart;
	}

	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
	
}
