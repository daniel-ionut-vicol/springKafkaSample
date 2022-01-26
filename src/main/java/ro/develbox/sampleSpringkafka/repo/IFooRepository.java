package ro.develbox.sampleSpringkafka.repo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import ro.develbox.sampleSpringkafka.model.Foo;

@Service
public interface IFooRepository extends PagingAndSortingRepository<Foo, Long>{

}
