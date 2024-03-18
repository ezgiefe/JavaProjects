package acm321w5;
import java.util.ArrayList;
public class arraylist {

public static void main(String[] args) {

	ArrayList <String> pcolors=new ArrayList<String>();	
// () icine deger girebilirim girmezsem sinirsiz olur
	pcolors.add("Red");  //artık deger(1)
	pcolors.add("Green");
	pcolors.add("Black");
	pcolors.add("White");
	pcolors.add("Pink");

	System.out.println("Original array list: "+pcolors);
	
	System.out.println("Original array list: "+pcolors.get(2));
	//sadece 2. indexi yazdirdi
	
/*	int size=pcolors.size();
	for(int i=0;i<size;i++)
		System.out.println(pcolors.get(i)); */
	
	for(String a:pcolors)
		System.out.println(a);
	
	pcolors.add("Purple");
	System.out.println("Original array list: "+pcolors);
	
	pcolors.remove("Green");
	System.out.println("Original array list: "+pcolors);
	
	System.out.println(pcolors.indexOf("Purple"));
	



	}

}
