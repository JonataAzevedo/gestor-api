package github.jonataazevedo.gestor.api.model.service;

import github.jonataazevedo.gestor.api.model.dto.AddressRequestDTO;
import github.jonataazevedo.gestor.api.model.entities.Address;

import java.util.Optional;

public interface AddressService {

    Address create(Integer personId, AddressRequestDTO addressRequestDTO);

    Optional<Address> findByPersonId(Integer personId);
}
