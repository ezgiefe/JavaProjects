package acm321w5;
import java.util.*;
//cogu kutuphaneyi cagirmayi sagliyor
import java.util.Random;
import java.util.Set;

public class swapelements {

public static void main(String[] args) {

	ArrayList<String> c1=new ArrayList<String>();
	c1.add("Red");
	c1.add("Green");
	c1.add("Black");
	c1.add("White");
	c1.add("Yellow");
	
	System.out.println("Array list before swap: ");
	for(String a:c1)
		System.out.println(a);
	
	Collections.swap(c1, 0, 2);
	
	System.out.println("Array list after swap: ");
	for(String b:c1)
		System.out.println(b);
//Red ve Black degerlerinin yerlerini degistirdik
	//RANDOM SINAVDA GELECEK
	
	}

}
