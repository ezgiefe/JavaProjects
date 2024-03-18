package acm321w6;
import java.util.HashMap;
import java.util.Map;
public class hashMap {

public static void main(String[] args) {

HashMap <String, Integer> phonebook= new HashMap<>();
//Add key value pairs (phone numbers) to  the hashmap
phonebook.put("Ege Ozdemir", 530874737);
phonebook.put("Arda Gok", 531748282);
phonebook.put("Ebrar Gok", 531775893);
phonebook.put("Arda Katar", 575038282);
System.out.println("Phone Book: "+phonebook);
//access the value (phone number) associated with a key (name)
String nameToLookUp="Arda Gok";
Integer phoneNumber= phonebook.get(nameToLookUp);
System.out.println(nameToLookUp+"'s phone number: "+phoneNumber);
String keyToCheck="Ezgi Efe";
if(phonebook.containsKey(keyToCheck))
	System.out.println("The key '"+keyToCheck+" exist in the hashmap");
else 
	System.out.println("The key '"+keyToCheck+" does not exist in the hashmap");
//remove a key value from the hashmap
String keyToRemove="Ege Ozdemir";
phonebook.remove(keyToRemove);
System.out.println("HashMap after remove: "+phonebook);
	
	
	
	}

}
