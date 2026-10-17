package guru.springframework.Spring_6_Webapp.services;

import guru.springframework.Spring_6_Webapp.domain.Author;


public interface AuthorService {

    Iterable<Author> findAll();
}
