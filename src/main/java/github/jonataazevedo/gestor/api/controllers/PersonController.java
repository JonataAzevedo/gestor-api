package github.jonataazevedo.gestor.api.controllers;

import java.util.List;

import github.jonataazevedo.gestor.api.model.dto.AddressRequestDTO;
import github.jonataazevedo.gestor.api.model.entities.Address;
import github.jonataazevedo.gestor.api.model.service.AddressService;
import github.jonataazevedo.gestor.api.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import github.jonataazevedo.gestor.api.model.dto.PersonResquestDTO;
import github.jonataazevedo.gestor.api.model.entities.Person;

@RestController
@RequestMapping(path = "/person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@Autowired
	private AddressService addressService;

	@PostMapping
	public ResponseEntity<Person> newPerson(@RequestBody PersonResquestDTO personDto) {
		return new ResponseEntity<>(personService.create(personDto), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Person>> findAll() {
		return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
	}

	@GetMapping ("/{id}")
	public ResponseEntity<Person> findById(@PathVariable Integer id) {
		return new ResponseEntity<>(personService.findById(id).get(), HttpStatus.OK);
	}

	@PostMapping("/{id}/address")
	public ResponseEntity<Address> createAddress(@PathVariable Integer id, @RequestBody AddressRequestDTO addressRequestDTO) {
		return new ResponseEntity<>(addressService.create(id, addressRequestDTO), HttpStatus.CREATED);
	}

	@PostMapping("/{id}/edit")
	public ResponseEntity<Person> editPerson(@PathVariable Integer id, @RequestBody PersonResquestDTO personResquestDTO)
	{
		return new ResponseEntity<>(personService.editPerson(id, personResquestDTO), HttpStatus.CREATED);
	}
}
