package org.primepro.librarymanagement.services;

import java.util.List;

import org.primepro.librarymanagement.entities.Library;

public interface LibraryDeleteService 
{
	  String deleteOneLibrary(Library library);
	  String PruneTable();//delete all the libraries
	  String deleteAllThese(List<Library>libraries);
	  String deleteAllInBatch();
	  String deleteLibraryById(int id);
	  String deleteAllTheseInBatch(List<Library> libraries);

}
