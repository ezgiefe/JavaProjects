
package exercise1;
import java.util.Scanner;

public class calculator {

public static void main(String[] args) {
	do {

System.out.println("[1] Addition");
System.out.println("[2] Subtraction");
System.out.println("[3] Multiplication");
System.out.println("[4] Division");

Scanner sc= new Scanner(System.in);
System.out.println("Enter two number: ");
int num1= sc.nextInt();
int num2= sc.nextInt();

System.out.println("Enter the operation number: ");
int op= sc.nextInt();

if(op==1) 
	System.out.println("Total: "+ Addition(num1, num2)); 	

else if(op==2)
	System.out.println("Total: "+ Subtraction(num1,num2)); 	

else if(op==3)
	System.out.println("Total: "+ Multiplication(num1,num2)); 	

else if(op==4)
	System.out.println("Total: "+ Division(num1,num2)); 	

else
	System.out.println("the operation number you entered is not valid.");

System.out.println("Do you want to contionue? (y/n): ");
char ch= sc.next().charAt(0);
if(ch=='n' || ch=='N')
	break;

	}
	
	while(1!=0);
	
}

public static int Addition(int num1, int num2) {
	int total= num1+num2;
	return total;     	}

public static int Subtraction(int num1, int num2) {
	int total= num1-num2;
	return total;			}

public static int Multiplication(int num1, int num2) {
	int total= num1*num2;
	return total;			}

public static int Division(int num1, int num2) {
	int total= num1/num2;
	return total;			}




}
