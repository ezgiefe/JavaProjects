package bonusProject;
import java.util.Random;
public class Project20211308024 {

	    public static void main(String[] args) {
	        int dice1 = RandomRollDice();
	        int dice2 = RandomRollDice();
	        //rolling two dices

	        RollingDice(dice1);
	        System.out.println(); 
	        RollingDice(dice2);
	        //printing the dices
	    }

	    public static int RandomRollDice() {
	        Random random = new Random();
	        return random.nextInt(6) + 1; 
	    //This method is for to generate a random number between 1 to 6 for dice number
	    }

	    public static void RollingDice(int diceNumber) {
	        if (diceNumber == 1) {
	            System.out.println(" _______");
	            System.out.println("|       |");
	            System.out.println("|       |");
	            System.out.println("|   *   |");
	            System.out.println("|       |");
	            System.out.println("|_______|");
	        } else if (diceNumber == 2) {
	            System.out.println(" _______");
	            System.out.println("|       |");
	            System.out.println("| *     |");
	            System.out.println("|       |");
	            System.out.println("|     * |");
	            System.out.println("|_______| ");
	        } else if (diceNumber == 3) {
	            System.out.println(" _______");
	            System.out.println("|       |");
	            System.out.println("| *     |");
	            System.out.println("|   *   |");
	            System.out.println("|     * |");
	            System.out.println("|_______| ");
	        } else if (diceNumber == 4) {
	            System.out.println(" _______");
	            System.out.println("|       |");
	            System.out.println("| *   * |");
	            System.out.println("|       |");
	            System.out.println("| *   * |");
	            System.out.println("|_______|");
	        } else if (diceNumber == 5) {
	            System.out.println(" _______");
	            System.out.println("|       |");
	            System.out.println("| *   * |");
	            System.out.println("|   *   |");
	            System.out.println("| *   * |");
	            System.out.println("|_______|");
	        } else if (diceNumber == 6) {
	            System.out.println(" _______");
	            System.out.println("|       |");
	            System.out.println("| *   * |");
	            System.out.println("| *   * |");
	            System.out.println("| *   * |");
	            System.out.println("|_______|");
	        } else {
	            System.out.println("This value is not valid for the dice. At least not for this one :)");
	        }
	    }
	}

	
