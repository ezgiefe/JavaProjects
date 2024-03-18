package acm321w6;

public class CountWordsInString {

public static void main(String[] args) {

String str= "Ey Edip Pide Ye";
int count= countWords(str);
System.out.println("Number of words: "+count);
	

	}

public static int countWords(String str) {
	String[] words= str.trim().split("\\s+");
	return words.length;
	
}

}
 