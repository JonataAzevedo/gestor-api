package github.jonataazevedo.gestor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.jonataazevedo.gestor.api.model.entities.Address;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

    Optional<Address> findByPersonId(Integer personId);

}
