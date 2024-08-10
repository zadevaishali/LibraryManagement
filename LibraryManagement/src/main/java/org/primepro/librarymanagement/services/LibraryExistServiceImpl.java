package org.primepro.librarymanagement.services;

import org.primepro.librarymanagement.entities.Library;
import org.primepro.librarymanagement.repository.LibraryRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LibraryExistServiceImpl implements LibraryExistService {

	private LibraryRepository libraryRepository;
	
	public LibraryExistServiceImpl(LibraryRepository libraryRepository) {
		super();
		this.libraryRepository = libraryRepository;
	}

	@Override
	public boolean checkLibraryExistsById(int id) {
		return libraryRepository.existsById(id);
	}

	@Override
	public boolean checkLibraryExistsByExample(String commaSeperatedBookNames) {
		Library library=new Library();
		 library.setCommaSeperatedBookNames(commaSeperatedBookNames);//probe object
		 ExampleMatcher matcher=ExampleMatcher.matching().withMatcher("commaSeperatedBppkNames",GenericPropertyMatchers.exact()).withIgnorePaths("id","name");

		Example<Library>example=Example.of(library,matcher);
		return libraryRepository.exists(example);

	}

}
