package test;
//Aggregation 
class Kopek{
	String ses= "hav hav";
}

class Kedi{
	String ses="miayv miyav";
}

class Hayvan{
	Kopek kpobj;
	Hayvan(Kopek kpobj){
		this.kpobj=kpobj;
	}
	Kedi kdobj;
	Hayvan(Kedi kdobj){
		this.kdobj=kdobj;
	}
	void displaykopek() {
		System.out.println(kpobj.ses);
	}
	void displaykedi() {
		System.out.println(kdobj.ses);
	}
}

public class test2 {

	public static void main(String[] args) {

		Kopek ko= new Kopek();
		Kedi kd= new Kedi();
		Hayvan hy= new Hayvan(ko);
		
		hy.displaykopek();
		System.out.println(ko.ses);
		System.out.println(kd.ses);
		
		
		
	}

}
