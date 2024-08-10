package org.primepro.librarymanagement.services;

import java.util.List;

import org.primepro.librarymanagement.entities.Library;
import org.primepro.librarymanagement.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LibraryCreateServiceImpl implements LibraryCreateService{
	 private LibraryRepository libraryRepository;
     
	  
	public LibraryCreateServiceImpl(LibraryRepository libraryRepository) {
		super();
		this.libraryRepository = libraryRepository;
	}

	@Override
	public String addSingleLibrary(Library library) {
		libraryRepository.save(library);
		libraryRepository.flush();
		

		  return "Library Added";

	}

	@Override
	public String addAllLibraries(List<Library> libraries) {
		libraryRepository.saveAll(libraries);
		libraryRepository.flush();
		return "AllLibraries Saved";

	}

	@Override
	public Library addLibraryWithSaveAndFlush(Library library) {
		 return libraryRepository.saveAndFlush(library);

	}

}
