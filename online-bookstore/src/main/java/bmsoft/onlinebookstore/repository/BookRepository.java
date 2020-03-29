package bmsoft.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bmsoft.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
