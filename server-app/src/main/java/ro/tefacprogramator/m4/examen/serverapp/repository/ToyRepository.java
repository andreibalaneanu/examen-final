package ro.tefacprogramator.m4.examen.serverapp.repository;

import org.springframework.data.repository.CrudRepository;

import ro.tefacprogramator.m4.examen.serverapp.entity.Toy;

public interface ToyRepository extends CrudRepository<Toy,Integer> {
    
}
