package github.jonataazevedo.gestor.api.service;

import github.jonataazevedo.gestor.api.model.dto.PersonResquestDTO;
import github.jonataazevedo.gestor.api.model.entities.Address;
import github.jonataazevedo.gestor.api.model.entities.Person;
import github.jonataazevedo.gestor.api.model.service.PersonService;
import github.jonataazevedo.gestor.api.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person create(PersonResquestDTO personResquestDTO) {
        Person person = modelMapper.map(personResquestDTO, Person.class);
        person.setAddresses(person.getAddresses().stream().map(a -> {
            Address address = modelMapper.map(a, Address.class);
            address.setPerson(person);
            return address;
        }).collect(Collectors.toList()));
        return personRepository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> findById(Integer id) {
        return personRepository.findById(id);
    }

    @Override
    public Person editPerson(Integer id, PersonResquestDTO personResquestDTO){
        Optional<Person> person = personRepository.findById(id);
        if(!person.isPresent()) {
            return null;
        }
        Person newPerson = person.get();
        newPerson.setName(personResquestDTO.getName());
        newPerson.setBirthDate(personResquestDTO.getBirthDate());
        return personRepository.save(newPerson);
    }
}























