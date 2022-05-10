package oopsdemo2;

import java.util.List;
//composition example
public class Library {
	
	List<Book> books;  //object reference --- composition
	
    //constructor to initialize books in library
	public Library(List<Book> books) {
		this.books = books;
	}

	//getter method to get books in library
	public List<Book> getBooks() {
		return books;
	}
	
	
}
