package github.jonataazevedo.gestor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.jonataazevedo.gestor.api.model.entities.Person;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}