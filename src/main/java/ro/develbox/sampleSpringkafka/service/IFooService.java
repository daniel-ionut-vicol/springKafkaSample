package ro.develbox.sampleSpringkafka.service;

import java.util.Optional;

import ro.develbox.sampleSpringkafka.model.Foo;

public interface IFooService {
	Optional<Foo> findById(Long id);

    Foo save(Foo foo);
    
    Iterable<Foo> findAll();
}
