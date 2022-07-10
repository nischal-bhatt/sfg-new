package sfg.section.two.repositories;

import org.springframework.data.repository.CrudRepository;
import sfg.section.two.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
