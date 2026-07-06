package guru.springframework.Spring_6_Webapp.services;

import guru.springframework.Spring_6_Webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
