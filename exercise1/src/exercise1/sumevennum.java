package exercise1;
import java.util.Random;
public class sumevennum {

public static void main(String[] args) {

int[] arr= new int[10];
Random rand= new Random();

for(int i=0;i< arr.length; i++) {
	arr[i]= rand.nextInt(100)+1;	}
	
int sum=0;
for(int num:arr) {
	if(num %2==0)
		sum+= num;	}
	
System.out.println("Sum of even numbers: "+sum);
	
	
	
	
	}

}
