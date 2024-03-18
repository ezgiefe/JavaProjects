package acm321w6;
import java.util.PriorityQueue;
public class queryexmp {

public static void main(String[] args) {

PriorityQueue<Integer> prior= new PriorityQueue<>();
prior.add(50);
prior.add(20);
prior.add(30);
prior.add(10);
prior.add(40);
System.out.println("Priority Queue: "+prior);	
while (!prior.isEmpty()) {
	System.out.println(prior.poll());
}
	
	}

}
