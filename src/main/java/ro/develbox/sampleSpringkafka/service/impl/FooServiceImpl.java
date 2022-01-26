package ro.develbox.sampleSpringkafka.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.develbox.sampleSpringkafka.model.Foo;
import ro.develbox.sampleSpringkafka.repo.IFooRepository;
import ro.develbox.sampleSpringkafka.service.IFooService;

@Service
public class FooServiceImpl implements IFooService {

	@Autowired
    private IFooRepository fooRepository;

	public Optional<Foo> findById(Long id) {
		return fooRepository.findById(id);
	}

	public Foo save(Foo foo) {
		return fooRepository.save(foo);
	}

	public Iterable<Foo> findAll() {
		return fooRepository.findAll();
	}

    
}
