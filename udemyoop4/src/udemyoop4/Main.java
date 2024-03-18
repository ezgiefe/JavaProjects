package udemyoop4;

public class Main {

public static void main(String[] args) {
//encapsulation bir classın özelliklerini başka bir sınıfa gizlemek
	
//	Abone ab= new Abone();
	
/*encapsulation kullanmama dezajantajları:
*constraactor tanımlamadığımız için java default olarak bir constractor tanımladı
*bakiyeye 200 verebiliyoruz ama kredi limitimiz 120 normalde bunun olmaması lazım  
* public yapmak yerine private yapsaydık bakiyeye direkt erişemeyeceğimiz için böyle olmazdı
* değerlerimiz 15 tane olsaydı ve bir tanesini bile başlatmayı unutsaydık classımız belki de yanlış çalışıcaktı
* abone classının bir özelliğindeki ismi değiştirdiğimizde bunu kullanan bütün classlarda isim değiştirmen gerekiyor 
* */
	
/*	ab.isim= "Ezgi Efe";
	ab.bakiye=200;
	ab.sehir="Istanbul";
	
	ab.dogalgazkullan(200);
*/
	
	gelismisAbone gab= new gelismisAbone("Ezgi Efe", 200, "Istanbul");
	gab.bakiyeogren();
//bakiyeyi biz 200 versek de max 120 olması gerektiği için 120 olarak değer alıyor
	
	
	
	
	
	
	}

}
