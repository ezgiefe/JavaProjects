package udemyoop;

public class test {

public static void main(String[] args) {

//	araba araba1= new araba();
	
/*	araba1.setModel("Renault");
	System.out.println("arabanin modeli: "+araba1.getModel());
	*/
	
	//Account account1= new Account();
	
/*	Account account2= new Account("65432", 1500.0, "Ezgi Efee", "eezgiefe@gmail.com", "3456786543");
	
	account2.bilgilerigoster();
	*/
	
	
	Yonetici yonetici1= new Yonetici("Ezgi efe", 2500, "IT", 10);
	Yonetici yonetici2= new Yonetici("doga alkan", 3500, "MIS", 15);
	//yonetici1.zamyap(200);
	yonetici1.zamyap(500);
	yonetici1.bilgilerigoster();

	yonetici2.bilgilerigoster();
	
	}

}
