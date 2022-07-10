package sfg.section.two.repositories;

import org.springframework.data.repository.CrudRepository;
import sfg.section.two.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
