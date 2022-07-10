package sfg.section.two.repositories;

import org.springframework.data.repository.CrudRepository;
import sfg.section.two.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
