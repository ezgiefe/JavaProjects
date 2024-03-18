package udemyoop8;
//diğer class static değildi bu class static versiyonu
public class Matematik2 {

	public static class Alan2{
//değeri de static olarak tanımlamak zorundayız static methodun içinde kullanmak için		
		private static double pi= Math.PI;
		public static void dairealan(int yaricap) {
			System.out.println("Dairenin alani: "+(yaricap*yaricap* pi));

		}
	}
}
