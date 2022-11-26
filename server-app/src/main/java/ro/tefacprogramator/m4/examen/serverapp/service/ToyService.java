package ro.tefacprogramator.m4.examen.serverapp.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.tefacprogramator.m4.examen.serverapp.entity.Toy;
import ro.tefacprogramator.m4.examen.serverapp.repository.ToyRepository;

@Service
public class ToyService {
    
    @Autowired
    private ToyRepository repo;

    public boolean createNewToy(Toy t1){

        repo.save(t1);

        return true;

    }

    public List<Toy> getCompleteListOfToys(){

        Iterable<Toy> result = repo.findAll();
        var resultIterator = result.iterator();
        var allToys = new ArrayList<Toy>();

        while (resultIterator.hasNext()) {
            allToys.add(resultIterator.next());
        }

        return allToys;

    }




}
