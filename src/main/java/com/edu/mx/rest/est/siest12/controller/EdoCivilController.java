package com.edu.mx.rest.est.siest12.controller;

import com.edu.mx.rest.est.siest12.entity.EdoCivil;
import com.edu.mx.rest.est.siest12.service.EdoCivilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edo-civil")
public class EdoCivilController {

    private EdoCivilService edoCivilService;

    @Autowired
    public EdoCivilController(EdoCivilService edoCivilService) {
        this.edoCivilService = edoCivilService;
    }

    @GetMapping("/list")
    public List<EdoCivil> getEdosCivils(){
        return edoCivilService.getEdoCivils();
    }

    @GetMapping("/list/{idEdoCivil}")
    public EdoCivil getEdoCivil(@PathVariable int idEdoCivil){
        return edoCivilService.getEdoCivil(idEdoCivil);
    }

    @PostMapping("/add")
    public EdoCivil addEdoCivil(@RequestBody EdoCivil objEdoCivil){
        edoCivilService.saveEdoCivil(objEdoCivil);
        return objEdoCivil;
    }

    @PutMapping("/update")
    public EdoCivil updateEdoCivil(@RequestBody EdoCivil objEdoCivil){
        edoCivilService.saveEdoCivil(objEdoCivil);
        return objEdoCivil;
    }

    @DeleteMapping("/edo-delete/{idEdoCivil}")
    public String deleteEdoCivil(@PathVariable int idEdoCivil){
        edoCivilService.deleteEdoCivil(idEdoCivil);
        return "El estado civil se elimino de forma correcta";
    }
}
