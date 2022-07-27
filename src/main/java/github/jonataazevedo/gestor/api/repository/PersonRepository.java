package github.jonataazevedo.gestor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.jonataazevedo.gestor.api.model.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	
}