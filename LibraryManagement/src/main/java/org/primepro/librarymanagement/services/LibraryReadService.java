package org.primepro.librarymanagement.services;

import java.util.List;
import java.util.Optional;

import org.primepro.librarymanagement.entities.Library;
import org.springframework.data.domain.Page;

public interface LibraryReadService 
{
	 List<Library>getAllLibraries();
	  List<Library>getAllLibrariesWithNoBooks();
	  Page<Library> getAllLibrary();
	  Page<Library>getLibrariesCustomPage(int pageNumber,int noOfRecordsPerPage);
	  List<Library> getLibrariesWithLatestAddedOrder();
	  Page<Library> getLibrariesPagedAndSortedByNameWithTheseBooks(String commaSeperatedBookNames);
	Page<Library> getLibraryCustomPagedandSortedWithDefaultOrderByNameAndWithTheseBooks(int pageNumber,int noOfPages,String commaSeperatedBookNames);
	List<Library> getLibrariesSortedByNameWithTheseBooks(String commaSeperatedBookNames);
	List<Library> getLibrariesByIds(List<Integer> ids);
	Optional<Library>getLibraryByID(Integer id);
	Optional<Library>getLibraryWithTheseBooksString (String commaSeperatedBookNames);


}
