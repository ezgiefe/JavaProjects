package ikincivize;
//q3
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BookUnavailableException extends Exception{
	public BookUnavailableException(String message) {
		super(message);
	}
}

class Library{
	private List<String> books;
	private List<String> members;
	public Library(List<String> books, List<String> members) {
		this.books = books;
		this.members = members;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public List<String> getMembers() {
		return members;
	}
	public void setMembers(List<String> members) {
		this.members = members;
	}
	
	
}

class Book{
	public boolean isBorrowed() {
		
	}
}

class Member{
	
	
	
	
}





public class q1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Almak istediginiz kitabi yazin: ");
		String kitap= sc.nextLine();
		
		
		
		
	}

}
