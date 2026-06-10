package guru.springframework.Spring_6_Webapp.bookstrap;


import guru.springframework.Spring_6_Webapp.domain.Author;
import guru.springframework.Spring_6_Webapp.domain.Book;
import guru.springframework.Spring_6_Webapp.domain.Publisher;
import guru.springframework.Spring_6_Webapp.repositories.AuthorRepository;
import guru.springframework.Spring_6_Webapp.repositories.BookRepository;
import guru.springframework.Spring_6_Webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;



    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("56789");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        Publisher kay = new Publisher();
        kay.setPublisherName("Kopanye Ramokgopa");
        kay.setAddress("5 Diagonal Street");
        kay.setCity("Midrand");
        kay.setState("Gauteng");
        kay.setZip("1685");

        Publisher kaySaved = publisherRepository.save(kay);

        dddSaved.setPublisher(kaySaved);
        noEJB.setPublisher(kaySaved);

        publisherRepository.save(kaySaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());


        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
