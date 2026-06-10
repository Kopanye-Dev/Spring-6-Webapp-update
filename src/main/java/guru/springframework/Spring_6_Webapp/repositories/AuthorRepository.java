package guru.springframework.Spring_6_Webapp.repositories;

import guru.springframework.Spring_6_Webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
