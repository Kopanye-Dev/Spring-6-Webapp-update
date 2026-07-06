package guru.springframework.Spring_6_Webapp.services;

import guru.springframework.Spring_6_Webapp.domain.Book;
import guru.springframework.Spring_6_Webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {



    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
