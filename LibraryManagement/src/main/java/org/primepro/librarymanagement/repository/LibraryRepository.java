package org.primepro.librarymanagement.repository;


import org.primepro.librarymanagement.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LibraryRepository extends JpaRepository<Library,Integer>
{
  
}
