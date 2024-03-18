package test;

interface CommDevice{
	void transmit(String dest, String data);
	boolean recieve(String sender, String data);
}

class Firewall implements CommDevice{
	private String permittedReciever;
	private String buffer;
	public Firewall(String permittedReciever) {
		this.permittedReciever=permittedReciever;
	}
	
	public void transmit(String dest, String data) {
		this.buffer=data;
		System.out.println("Data scheduled for transmition to "+dest);
	}

	public boolean recieve(String sender, String data) {
		if(sender.equals(permittedReciever)) {
			this.buffer=data;
			return true;
		}
		else {
			this.buffer= " ";
			System.out.println("Attempted breach of firewall by "+sender);
			return false;
		}
		
	}
	
}


public class test3 {

	public static void main(String[] args) {

		
		
		
		
		
	}

}
