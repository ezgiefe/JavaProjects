package midtrm;
import java.util.Random;
import java.util.TreeMap;
public class q4 {
public static void main(String[] args) {
Random rand=new Random();
TreeMap<String,Integer> tmap=new TreeMap<>();
tmap.put("Ezgi", rand.nextInt(100)+1);
tmap.put("Aleyna", rand.nextInt(100)+1);
tmap.put("Engin",rand.nextInt(100)+1);
tmap.put("Yuksel", rand.nextInt(100)+1);
tmap.put("Nur",rand.nextInt(100)+1);
printStudentScores(tmap);

}
public static void printStudentScores(TreeMap<String,Integer> tmap) {
System.out.println("scores: ");
for(String i : tmap.keySet()) {
	int sc=tmap.get(i);
	System.out.println(i+" : "+sc);
}
}

		
	}


