package acm321w6;

public class wprint {

public static void main(String[] args) {
for(int i=0;i<5;i++) {
	for(int j=0;j<15;j++) {
	if(i==j || (j>4 && i+j==8 && j<8)||(j>7 && j<11 && j-i==6)||(j>10&&i+j==14))
		System.out.print("*");
	else
		System.out.print(" ");
			}
System.out.println(" ");
		}
	}

}
