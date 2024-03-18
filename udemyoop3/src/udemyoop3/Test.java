package udemyoop3;

public class Test {

public static void main(String[] args) {
	Resolution res= new Resolution(1920,1080);
	Monitor mon= new Monitor("VS197DE", "ASUS", "18.5",res);
	
	Kasa ks= new Kasa("Shadow Blade", "Shadow", "Temperli cam");
	
	Anakart akart= new Anakart("B250-PRO","ASUS",10,"Widows10");
	
	Bilgisayar pc= new Bilgisayar(mon, ks,akart);
	
	pc.getKasa().pcac();
	pc.getMonitor().monitorukapat();
	pc.getAnakart().isletimsysyukle("Ubuntu 16.4");
	pc.getKasa().pckapat();
			
	}

}
