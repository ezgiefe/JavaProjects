package acm321w3;
import java.util.Scanner;

class Test {
	void areacircle() {
		System.out.println("Enter the radius: ");
		Scanner s=new Scanner(System.in);
		float r=s.nextFloat();
		float ar;
		ar=(r*r)*22/7;
		System.out.println(" area of the circle is: "
		+ar+" sq units");
	}
	
}

public class methoddemo {

public static void main(String[] args) {

	Test obj=new Test();
	obj.areacircle();
	}

}
