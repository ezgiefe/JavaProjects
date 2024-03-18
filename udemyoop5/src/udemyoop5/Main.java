package udemyoop5;

class Hayvan {
	private String isim;
	
	public Hayvan (String isim) {
		this.setIsim(isim);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String konus() {
		return "Hayvan konusuyor...";
	}
}

class Kedi extends Hayvan {
	public Kedi(String isim) {
		super(isim);
	}
	public String konus() {
		return this.getIsim()+ " miyavliyor..."; 
	}
}
class Kopek extends Hayvan {
	public Kopek(String isim) {
		super(isim);
	}
	public String konus() {
		return this.getIsim()+ " havliyor...";
	}
}
class At extends Hayvan {
	public At(String isim) {
		super(isim);
	}
	public String konus() {
		return super.getIsim()+ " kisniyor...";
	}
}


public class Main {
	
	public static void konustur(Hayvan hay) {
		System.out.println(hay.konus());
		
// polymorphism olmasaydı sğrekli böyle kontrol yapmamız gerekicekti
/*		if(ob instanceof Kopek) {
			Kopek kp= (Kopek) ob;
			System.out.println(kp.konus());
		}
		else if(ob instanceof Kedi) {
			Kedi kd= (Kedi) ob;
			System.out.println(kd.konus());
		}
		else if(ob instanceof At) {
			At at1= (At) ob;
			System.out.println(at1.konus());
		}
		else if(ob instanceof Hayvan) {
			Hayvan hy= (Hayvan) ob;
			System.out.println(hy.konus());
		}
*/	
	}

	public static void main(String[] args) {
//bir nesnenin birden fazla nesneymiş giib davranması
	
		Hayvan hay1= new Kedi("Tekir");
		Hayvan hay2= new Kopek("Karabas");
		Hayvan hay3= new At("Pamuk");
	//polymorphism yukarıdaki gibi oluyor 
		
		System.out.println(hay1.konus());
		System.out.println(hay2.konus());
		System.out.println(hay3.konus());
		
		konustur(new Kedi("Tekir"));
		konustur(new Kopek("Karabas"));
		konustur(new At("Pamuk"));

		
//instanceof anahtar kelimesine bir obje vericez ve bu objenin hangi classtan olduğunu anlamaya çalışıcaz
/*		 Kopek kp= new Kopek("Karabas");
		 Kedi kd= new Kedi("Lokum");
		 At at1= new At("Pamuk");
		 Hayvan hy= new Hayvan("Limon");
		 
		 konustur(kp);
		 konustur(kd);
		 konustur(at1);
		 konustur(hy);
*/		 
		 if(hay1 instanceof Kedi)
			 System.out.println("Bu nesne kedi classindan");
		 else
			 System.out.println("Bu nesle kedi classindan degil");
//kp hem Kopek classından hem de Hayvan classından		 
		


}

}
