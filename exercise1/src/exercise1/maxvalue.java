package exercise1;
import java.util.Random;
public class maxvalue {
	
	public static int getmaxvalue(int[] arr) {
		int max= arr[0];
		for(int num:arr) {
			if(num>max)
				max=num;	}
	return max;	
	}
	
	
public static void main(String[] args) {
int[] arr= new int[10];
Random rand= new Random();

for(int i=0;i<arr.length;i++) {
	arr[i]= rand.nextInt(100)+1;
}

int max= getmaxvalue(arr);
System.out.println("Max value: "+max);

	}

}
