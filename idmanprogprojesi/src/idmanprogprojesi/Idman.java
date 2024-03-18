package idmanprogprojesi;

public class Idman {
	private int burpeesay;
	private int pushupsay;
	private int situpsay;
	private int squatsay;

	public Idman(int burpeesay, int pushupsay, int situpsay, int squatsay) {
		this.setBurpeesay(burpeesay);
		this.setPushupsay(pushupsay);
		this.setSitupsay(situpsay);
		this.setSquatsay(squatsay);
	}

	public int getBurpeesay() {
		return burpeesay;
	}

	public void setBurpeesay(int burpeesay) {
		this.burpeesay = burpeesay;
	}

	public int getPushupsay() {
		return pushupsay;
	}

	public void setPushupsay(int pushupsay) {
		this.pushupsay = pushupsay;
	}

	public int getSitupsay() {
		return situpsay;
	}

	public void setSitupsay(int situpsay) {
		this.situpsay = situpsay;
	}

	public int getSquatsay() {
		return squatsay;
	}

	public void setSquatsay(int squatsay) {
		this.squatsay = squatsay;
	}
	
	public void hareketyap(String hareket, int sayi) {
		if(hareket.equals("burpee")) 
			burpeeyap(sayi);
		else if(hareket.equals("pushup"))
			pushupyap(sayi);
		else if(hareket.equals("situp"))
			situpyap(sayi);
		else if(hareket.equals("squat"))
			squatyap(sayi);
		else
			System.out.println("Gecersiz islem...");
	}
	
	public void burpeeyap(int sayi) {
		if(burpeesay==0)	
			System.out.println("Yapacak burpee kalmadi...");
		if(burpeesay-sayi<0) {
			System.out.println("Hedefledigin burpee sayisini gectin tebrikler...");
			burpeesay=0;
			System.out.println("Kalan burpee sayisi: "+burpeesay);	
		}
		else {
			burpeesay-=sayi;
			System.out.println("Kalan burpee sayisi: "+burpeesay);	
		}		
	}
	public void pushupyap(int sayi) {
		if(pushupsay==0)
			System.out.println("Yapacak pushup kalmadi...");
		if(pushupsay-sayi<0) {
			System.out.println("Hedefledigin pushup sayisini gectin tebrikler...");
			pushupsay=0;
			System.out.println("Kalan pushup sayisi: "+pushupsay);	
		}
		else {
			pushupsay-=sayi;
			System.out.println("Kalan pushup sayisi: "+pushupsay);	
		}		
	}
	public void situpyap(int sayi) {
		if(situpsay==0)
			System.out.println("Yapacak situp kalmadi...");
		if(situpsay-sayi<0) {
			System.out.println("Hedefledigin situp sayisini gectin tebrikler...");
			situpsay=0;
			System.out.println("Kalan situp sayisi: "+situpsay);	
		}
		else {
			situpsay-=sayi;
			System.out.println("Kalan situp sayisi: "+situpsay);	
		}		
	}
	public void squatyap(int sayi) {
		if(squatsay==0)
			System.out.println("Yapacak squat kalmadi...");
		if(squatsay-sayi<0) {
			System.out.println("Hedefledigin squat sayisini gectin tebrikler...");
			squatsay=0;
			System.out.println("Kalan squat sayisi: "+squatsay);	
		}
		else {
			squatsay-=sayi;
			System.out.println("Kalan squat sayisi: "+squatsay);	
		}		
	}
	
	public boolean idmanbittimi() {
		return(burpeesay==0) && (pushupsay==0) && (situpsay==0) && (squatsay==0) ;
	}
	
}
