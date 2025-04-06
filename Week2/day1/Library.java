package Week2.day1;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println(bookTitle);
		return bookTitle;
	}
	public void issueBook() {
		
		System.out.println("Book issued successfully");
	}
	

	public static void main(String[] args) {
	
		Library libObject=new Library();
		libObject.addBook("Book added successfully");
		libObject.issueBook();
		
	}

}
