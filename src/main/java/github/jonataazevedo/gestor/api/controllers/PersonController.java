package github.jonataazevedo.gestor.api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.jonataazevedo.gestor.api.model.dto.PersonResquestDTO;
import github.jonataazevedo.gestor.api.model.entities.Person;
import github.jonataazevedo.gestor.api.repository.PersonRepository;

@RestController
@RequestMapping(path = "/person")
public class PersonController {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping
	public ResponseEntity<Person> newPerson(@RequestBody PersonResquestDTO personDto) {
		Person person = modelMapper.map(personDto, Person.class);	
		return ResponseEntity.ok(personRepository.save(person));
	}

}
