package github.jonataazevedo.gestor.api.model.service;

import github.jonataazevedo.gestor.api.model.dto.PersonResquestDTO;
import github.jonataazevedo.gestor.api.model.entities.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person create(PersonResquestDTO personResquestDTO);

    List<Person> findAll();

    Optional<Person> findById(Integer id);

    Person editPerson(Integer id, PersonResquestDTO personResquestDTO);
}
