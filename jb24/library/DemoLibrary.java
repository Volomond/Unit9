package by.epam.jb24.library;

import java.util.List;

public class DemoLibrary {

	public static void main(String[] args) {
		Library myLibra = new Library();

		myLibra.add(new Book("Lord of the rings","J.Tolkin", 1000000,20.5));
		myLibra.add(new Book("Game of thrones","J.Martin", 100000,15.5));
		myLibra.add(new Book("Withcher","A.Sapkovski", 50000,10));
		myLibra.add(new Magazine("Top Gear",5000,5));
		myLibra.add(new Magazine("Salon",5000,3));
		myLibra.add(new Directory("Phonebook",12000,2.5));
		
		List<PrintedEdition> lists = myLibra.getLibraLst();
		print(new PrintList(),lists);
		
	}
	
	public static void print(Printer toPrintObj, List<PrintedEdition> lists) {
		toPrintObj.print(lists);
	}
}
