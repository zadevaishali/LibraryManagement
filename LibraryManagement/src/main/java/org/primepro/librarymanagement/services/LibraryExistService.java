package org.primepro.librarymanagement.services;

public interface LibraryExistService {
	  boolean checkLibraryExistsById(int id);
	  boolean checkLibraryExistsByExample(String commaSeperatedBookNames);

}
