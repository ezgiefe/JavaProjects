package test;
import java.util.ArrayList;
import java.util.List;

class NoSeatAvailableException extends Exception {
	public NoSeatAvailableException(String msj) {
	super(msj);
	}
}
class bus{
	private List<String> passanger;
	private int maxpassanger=50;;
	public bus(int maxpassanger) {
		if(maxpassanger<=50 && maxpassanger>0) {
		this.maxpassanger = maxpassanger;
		}
		this.passanger = new ArrayList<>();
	}
	public List<String> getPassanger() {
		return passanger;
	}
	public void setPassanger(List<String> passanger) {
		this.passanger = passanger;
	}
	public int getMaxpassanger() {
		return maxpassanger;
	}
	public void setMaxpassanger(int maxpassanger) {
		this.maxpassanger = maxpassanger;
	}
	public void addPassanger(String pasanger) throws NoSeatAvailableException {
		if(passanger.size()>=maxpassanger) {
			throw new NoSeatAvailableException("there is not enought seat");
		}
		else {
			passanger.add(pasanger);
			 System.out.println("Passenger '" + pasanger + "' added to the bus.");
		}
		
	}
}
public class test4 {
	
	public static void main(String[] args) {
		bus b=new bus(50);
		int i=0;
		try {
			while(true) {
				i++;
				String passanger="passanger "+i;
				b.addPassanger(passanger);
			}
		}
		catch(NoSeatAvailableException e) {
			System.out.println(e.getMessage());
		}
	}
}