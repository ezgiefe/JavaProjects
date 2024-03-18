package udemyoop7;

public class Test {

	public static void main(String[] args) {
//main methodunun bellekte direkt olarak oluşması gerekiyor o yüzden static olarak tanımlıyoruz
//yoksa no main class found diye bir hata alıyoruz
		Seyirci sy1= new Seyirci("Ezgi efe");
		Seyirci sy2= new Seyirci("Doga alkan");
		Seyirci sy3= new Seyirci("Yagmur dere");

		
		sy1.oyunseyret();
		sy2.oyunseyret(); 
		System.out.println("Seyirci sayisi: "+ sy1.getseyircisay());
	
//		System.out.println("Seyirci sayisi: "+ Seyirci.seyircisay);
// seyirci tanımlamadığımızda da default olarak verdiğimiz değer yani 0 olarak gözüküyor	
/* static bir methodun içinde static olmayan bir methodu direkt olarak kullanamayız!!	
çünkü static olarak tanımladıklarımız program çalıştığı zaman direkt olarak bellekte oluşuyor
bellekte oluşan bir methodun içine oluşmayan bir methodu kullanamayız 
*/	
	}
	

}
