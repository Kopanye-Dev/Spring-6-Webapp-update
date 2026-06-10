package guru.springframework.Spring_6_Webapp.repositories;

import guru.springframework.Spring_6_Webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
