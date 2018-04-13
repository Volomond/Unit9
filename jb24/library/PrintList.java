package by.epam.jb24.library;

import java.util.List;

public class PrintList implements Printer{

	@Override
	public void print(List<PrintedEdition> unit) {
		System.out.println("Your Library: ");
				for(PrintedEdition pEdition : unit) {
			pEdition.printInfo();
		}
		
	}
}


