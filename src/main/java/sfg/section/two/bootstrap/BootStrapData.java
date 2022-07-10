package sfg.section.two.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfg.section.two.domain.Author;
import sfg.section.two.domain.Book;
import sfg.section.two.domain.Publisher;
import sfg.section.two.repositories.AuthorRepository;
import sfg.section.two.repositories.BookRepository;
import sfg.section.two.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("SFG");
        publisher.setCity("ST PETERSBURG");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("publisher count " + publisherRepository.count());


        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("ddd","12345");


        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        publisherRepository.save(publisher);
        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE","1111");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add((noEJB));

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("started in bootstrap");
        System.out.println("Number of books " + bookRepository.count());
        System.out.println("publisher number of books " + publisher.getBooks().size());



    }
}
