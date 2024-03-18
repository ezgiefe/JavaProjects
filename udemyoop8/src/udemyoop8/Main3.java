package udemyoop8;
//Local inner classlar
public class Main3 {

	public static void main(String[] args) {

		class Alan3{
			public void dairealan3(int r) {
				System.out.println("Dairenin alani: "+(r*r* Math.PI));
			}
		}
		
		Alan3 al= new Alan3();
		al.dairealan3(10);
	}

}


/* Daha önceki inner classlar bir classın altında tanımlanıyordu
 * Local inner classlar bir methodun içinde tanımlanıyor
 * başka bir classtan erişemiyoruz local inner classlara çünkü o methoda özgü oluyor
 */


