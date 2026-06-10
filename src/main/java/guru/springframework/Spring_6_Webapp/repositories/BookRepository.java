package guru.springframework.Spring_6_Webapp.repositories;

import guru.springframework.Spring_6_Webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
