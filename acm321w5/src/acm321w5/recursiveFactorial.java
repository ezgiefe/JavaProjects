package acm321w5;
public class recursiveFactorial {

public static void main(String[] args) {

	int n=5;
	System.out.println("Factorial of "+n+" is: "+factorial(n));
	
	
	}

public static int factorial(int n) {
	if(n==0)
		return 1;
	else 
		return n*factorial(n-1);
	//else olmadan da calisir.
	//n 0 olana kadar fonksiyonu çalıştırır
}

}







