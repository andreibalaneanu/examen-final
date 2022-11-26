package ro.tefacprogramator.m4.examen.serverapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ro.tefacprogramator.m4.examen.serverapp.entity.Toy;
import ro.tefacprogramator.m4.examen.serverapp.service.ToyService;

@RestController
public class ToyController {

    @Autowired
    private ToyService toyService;
    
    @CrossOrigin
    @PostMapping("/toy/add")
    public Map<String,Object> addNewToy(@RequestBody Toy t1){
        var result = new HashMap<String,Object>();
        
        // if (t1.getDescription()=="") {
        //     result.put("fail", "please add description");
        //     return result;
        // }

        // if (t1.getPrice() == 0) {
        //     result.put("fail", "please add a valid price");
        //     return result;
            
        // }

        // if (t1.getCategoryID() == 0 || t1.getCategoryID() >= 6) {
        //     result.put("fail", "please select a valid category");
        //     return result;
        // }
        
        // if (t1.getTypeId()==0 || t1.getTypeId() >= 3) {
        //     result.put("fail", "please select a valid type");
        //     return result;
        // }


        if (toyService.createNewToy(t1)) {
            result.put("success", true);
        }else{
            result.put("success", false);
        }

        return result;

    }

    @CrossOrigin
    @GetMapping("/toy/getAll")
    public List<Toy> getAllToys(){
        return toyService.getCompleteListOfToys();
    }


}
