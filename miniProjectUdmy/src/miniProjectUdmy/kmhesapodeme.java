package miniProjectUdmy;
import java.util.Scanner;
public class kmhesapodeme {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Araciniz km'de kac kr yakiyor (Orn: 0,32): ");
double kr= sc.nextDouble();

System.out.println("Kac km gittiniz: ");
int km= sc.nextInt();

System.out.println("toplam odemeniz gereken tutar: "+(kr * km)+" TL");

	}

}
