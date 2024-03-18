package exercise1;

public class countwords {

public static void main(String[] args) {

String str= "You are the best paint life ever made";
int count= counting(str);
System.out.println("number of words: "+ count);
	}
public static int counting(String str) {
	String[] words= str.trim().split("\\s");
	return words.length;
}


}
