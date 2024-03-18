package acm321w4;
import java.util.Scanner;
public class bmicalculator {

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your weight in kg: ");
	double weight=sc.nextDouble();
	
	System.out.println("Enter your height in m: ");
	double height=sc.nextDouble();
	double bmi= weight/(height*height);
	System.out.println("Your BMI is: "+bmi);
	
	if(bmi<18.5)
		System.out.println("You are underweight.");
	else if(bmi<25)
		System.out.println("You are within the normal weight range.");
	else if(bmi<30)
		System.out.println("You are in obesity class-1.");
	else if(bmi<35)
		System.out.println("You are in obesity class-2.");
	else
		System.out.println("You are in obesity class-3.");
	sc.close();
	}

}
