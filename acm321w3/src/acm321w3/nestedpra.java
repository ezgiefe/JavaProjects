package acm321w3;

public class nestedpra {

public static void main(String[] args) {

	for(int v=0;v<5;v++) {
		System.out.println("*");
	}
	for(int v=0;v<5;v++) {
		System.out.print("*");
	}
	System.out.println("\n");	

	
	for(int k=1;k<=10;k+=2) {
		for(int b=0;b<(10-k)/2;b++) {
			System.out.print(" "); }
	
		for(int y=0;y<k;y++) {
			System.out.print("*"); }
		
		System.out.println("");	
	}
	
	}
}

 
	