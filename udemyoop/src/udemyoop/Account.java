package udemyoop;

public class Account {


	private String hesapno;
	private double bakiye;
	private String isim;
	private String email;
	private String telno;
	
	public void parayatir(double miktar) {
		bakiye += miktar;
		System.out.println("Yeni bakiye= "+bakiye);
	}
	
	public void paracekme(double miktar) {
		if(miktar >1500)
			System.out.println("Bir gunde 1500 TL'den daha fazla cekemezsiniz.");
		if(bakiye- miktar<0 )
			System.out.println("Yeterli bakiye yok. Bakiyeniz= "+bakiye);
		else {
			bakiye -= miktar;
			System.out.println("Yeni bakiye= "+bakiye);	
			}
	}
	
	public String getHesapno() {
		return hesapno;
	}
	public void setHesapno(String hesapno) {
		this.hesapno = hesapno;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	public Account() {
		this("Bilgi Yok", 0.0, "Bilgi Yok","Bilgi Yok","Bilgi Yok");
		
		//classın ismi ile aynı olması lazım contractor olması için
	//	System.out.println("Kendi yazdigimiz constractor...");
//constractorlar objeler oluştururken ilk çağırılan fonksiyon	
	}
	public Account(String hesapno, double bakiye, String isim, String email, String telno) {
		
		this.hesapno= hesapno;
		this.isim= isim;
		this.bakiye= bakiye;
		this.email= email;
		this.telno= telno;
	}
	public Account(String isim, String email, String telno) {
		this("Bilgi Yok",0.0,isim,email,telno);
	}
	
	
	public void bilgilerigoster() {
		System.out.println("Hesap No: "+this.hesapno);
		System.out.println("Bakiye: "+this.bakiye);
		System.out.println("Isim: "+this.isim);
		System.out.println("Email: "+this.email);
		System.out.println("Telefon No: "+this.telno);
		
	}
	
	

}
