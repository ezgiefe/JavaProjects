package acm321w6;
import java.util.HashSet;
import java.util.Set;
public class hashSet {

public static void main(String[] args) {

Set <String> list= new HashSet<>();
// 1) add some elements to set
	list.add("Apple");
	list.add("Banana");
	list.add("Cherry");
	list.add("Kiwi");
	System.out.println("Set: "+list);
	String elementToCheck= "Cherry";
	if(list.contains(elementToCheck))
		System.out.println("The element '"+elementToCheck+"' exist in the set");
	else
		System.out.println("The element ' "+elementToCheck+" does not exist in the set");
	String elementToRemove= "Kiwi";
	list.remove(elementToRemove);
	System.out.println("Set after remove: "+list);
	
	}

}
