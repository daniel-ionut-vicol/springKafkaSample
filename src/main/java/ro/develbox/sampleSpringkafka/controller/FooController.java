package ro.develbox.sampleSpringkafka.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ro.develbox.sampleSpringkafka.dto.FooDto;
import ro.develbox.sampleSpringkafka.model.Foo;
import ro.develbox.sampleSpringkafka.service.IFooService;

@RestController
@RequestMapping(value = "/api/foos")
public class FooController {
	private IFooService fooService;

    public FooController(IFooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping(value = "/{id}")
    public FooDto findOne(@PathVariable Long id) {
        Foo entity = fooService.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return convertToDto(entity);
    }

    @GetMapping
    public Collection<FooDto> findAll() {
        Iterable<Foo> foos = this.fooService.findAll();
        List<FooDto> fooDtos = new ArrayList<>();
        foos.forEach(p -> fooDtos.add(convertToDto(p)));
        return fooDtos;
    }

    protected FooDto convertToDto(Foo entity) {
        FooDto dto = new FooDto(entity.getId(), entity.getName());

        return dto;
    }
}
