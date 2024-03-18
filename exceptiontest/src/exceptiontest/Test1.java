package exceptiontest;

public class Test1 {

	public static void main(String[] args) {

		try {
			int a= 30/0;
		}
		
		catch(ArithmeticException e){
			System.out.println("bir sayi 0'a bolunemez.");
		}
	}

}
