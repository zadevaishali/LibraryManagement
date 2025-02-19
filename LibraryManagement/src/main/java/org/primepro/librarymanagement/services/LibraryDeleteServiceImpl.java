package org.primepro.librarymanagement.services;

import java.util.List;

import org.primepro.librarymanagement.entities.Library;
import org.primepro.librarymanagement.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LibraryDeleteServiceImpl implements LibraryDeleteService{
	private LibraryRepository libraryRepository;
	
	    
	public LibraryDeleteServiceImpl(LibraryRepository libraryRepository) {
		super();
		this.libraryRepository = libraryRepository;
	}

	@Override
	public String deleteOneLibrary(Library library) {
		libraryRepository.delete(library);
		  return "Deleted Library "+library;
	}

	@Override
	public String PruneTable() {
		libraryRepository.deleteAll();
		return "Prune Completed";

	}

	@Override
	public String deleteAllThese(List<Library> libraries) {
		libraryRepository.deleteAll(libraries);
		  return "Deleted All Completed";

	}

	@Override
	public String deleteAllInBatch() {
		libraryRepository.deleteAllInBatch();
		  return "Delete All in batch is completed";

	}

	@Override
	public String deleteLibraryById(int id) {
		libraryRepository.deleteById(id);
		  return "Library with id  "+ id+ "is deleted";

	}

	@Override
	public String deleteAllTheseInBatch(List<Library> libraries) {
		 libraryRepository.deleteAllInBatch(libraries);
		  return "Delete All the libraries in the list in batch mode";

	}

}
