package midtrm;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inp = sc.nextLine();

        Map<Character, Integer> cf = new HashMap<>();

        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (cf.containsKey(ch)) {
                cf.put(ch, cf.get(ch) + 1);
            } else {
                cf.put(ch, 1);
            }
        }

        System.out.println("character frequencyies:");
        
        for (Map.Entry<Character, Integer> a : cf.entrySet()) {
            System.out.println( a.getKey() + ":" + a.getValue());
        }
    }
}
