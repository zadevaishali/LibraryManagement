package org.primepro.librarymanagement.services;

import java.util.List;

import org.primepro.librarymanagement.entities.Library;

public interface LibraryCreateService
{
	  String addSingleLibrary(Library library);
	  String addAllLibraries(List<Library>libraries);
	  Library addLibraryWithSaveAndFlush(Library library);

}
