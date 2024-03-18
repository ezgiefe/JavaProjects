package udemyoop;

public class Main {

public static void main(String[] args) {

	/*Account account1= new Account("Ezgi Efe", "ezgiefe@gmail.com","4356787654");
	Account account2= account1;
	//iki referans da aynı objeyi gösteriyor
	Account account3= new Account();
	*/
	
	//new Account("Ezgi Efee", "eezgiefe@gmail.com","568765");
	
	ATM atm= new ATM();
	Hesap hesap= new Hesap("Ezgiefe", "34567",2000);
	
	atm.calis(hesap); //hesap objesini gönderdik
	System.out.println("Programdan cikiliyor...");
		
	
	
	}

}
