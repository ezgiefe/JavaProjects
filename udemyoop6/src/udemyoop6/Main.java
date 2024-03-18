package udemyoop6;

public class Main {

public static void main(String[] args) {

	Pcmuhendis muh1= new Pcmuhendis(false,false);
	//referans kısmına Imuhendis de yazabiliriz
	//interfaceler obje olamaz ama referans oluşturulabilir
	
/*	muh1.askerliksorgula();
	muh1.adlisicilsorgula();
	System.out.println(muh1.mezuniyetort(3.07));
	
	String[] tecrube= {"Vestel", "Havelsan", "Turksat"};
	muh1.istecrubesi(tecrube);
*/
	
	Makinemuh muh2= new Makinemuh(true,false);
//Imuhendis ile referans vermeye çalışınca referansgetir methodunda sorun çıkartıyor 
//çünkü interface bunu göremiyor
	
	String[] tecrube= {};
	String[] referans= {"Ezgi efe", "Mustafa Coskun"};
	
	muh2.adlisicilsorgula();
	muh2.askerliksorgula();
	System.out.println(muh2.mezuniyetort(2.43));
	muh2.istecrubesi(tecrube);
	muh2.referansgetir(referans);
	muh2.calis();
	
	
	}

}
