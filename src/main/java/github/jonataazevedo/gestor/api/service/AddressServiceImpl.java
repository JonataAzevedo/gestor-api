package github.jonataazevedo.gestor.api.service;

import github.jonataazevedo.gestor.api.model.dto.AddressRequestDTO;
import github.jonataazevedo.gestor.api.model.entities.Address;
import github.jonataazevedo.gestor.api.model.entities.Person;
import github.jonataazevedo.gestor.api.model.service.AddressService;
import github.jonataazevedo.gestor.api.model.service.PersonService;
import github.jonataazevedo.gestor.api.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PersonService personService;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address create(Integer personId, AddressRequestDTO addressRequestDTO) {
        Optional<Person> person = personService.findById(personId);
        if (person.isEmpty()){
            throw new RuntimeException("Pessoa inexistente");
        }
        Address address = modelMapper.map(addressRequestDTO, Address.class);
        address.setPerson(person.get());
        return addressRepository.save(address);
    }

    @Override
    public Optional<Address> findByPersonId(Integer personId) {
        return addressRepository.findByPersonId(personId);
    }
}
