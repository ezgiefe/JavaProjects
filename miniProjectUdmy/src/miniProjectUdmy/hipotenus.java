package miniProjectUdmy;
import java.util.Scanner;
public class hipotenus {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Kenar uzunluklari: ");
	int k1= sc.nextInt();
	int k2= sc.nextInt();

	double h= Math.sqrt((Math.pow(k1,2))+(Math.pow(k2,2)));
	
	System.out.println("hiptenus: "+h);
	}

}
