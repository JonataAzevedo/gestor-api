package github.jonataazevedo.gestor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.jonataazevedo.gestor.api.model.entities.Adress;

public interface AdressRepository extends JpaRepository<Adress, Integer>{

}
