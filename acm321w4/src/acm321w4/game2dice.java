package acm321w4;
public class game2dice {

public static void main(String[] args) {

	int dice1= (int) (6*Math.random()+1); // +1 dedik çünkü 0 değerini istemiyouz
	int dice2= (int) (6*Math.random()+1);
	//6 kaç tane değer istediğimize bağlı zarın 6 yüzü var o güzeden 6 dedik
	for(int i=0;i<dice1;i++)
		System.out.println("*");
	
	System.out.println(dice1);
	System.out.println(" \n\n ");

	for(int j=0;j<dice2;j++)
		System.out.println("*");
	
	System.out.println(dice2);
	}

}
