package ro.tefacprogramator.m4.examen.serverapp.repository;

import org.springframework.data.repository.CrudRepository;

import ro.tefacprogramator.m4.examen.serverapp.entity.Category;

public interface CategoryRepository extends CrudRepository<Category,Integer> {
    
}
