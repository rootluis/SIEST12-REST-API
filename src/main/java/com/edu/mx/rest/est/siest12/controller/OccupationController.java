package com.edu.mx.rest.est.siest12.controller;

import com.edu.mx.rest.est.siest12.entity.Occupation;
import com.edu.mx.rest.est.siest12.service.OccupationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/occupation")
public class OccupationController {

    private OccupationService occupationService;

    public OccupationController(OccupationService occupationService) {
        this.occupationService = occupationService;
    }

    @GetMapping("/list")
    public List<Occupation> occupatios(){
        return occupationService.occupations();
    }

    @GetMapping("/list/{idOccupation}")
    public Occupation getOccupation(@PathVariable int idOccupation){
        return occupationService.getOccupation(idOccupation);
    }

    @PostMapping("/add")
    public Occupation saveOccupation(@RequestBody Occupation objOccupation){
        objOccupation.setIdOccupation(0);
        occupationService.saveOccupation(objOccupation);
        return objOccupation;
    }

    @PutMapping("/update")
    public Occupation updateOccupation(@RequestBody Occupation objOccupation){
        occupationService.saveOccupation(objOccupation);
        return objOccupation;
    }

    @DeleteMapping("/delete/{idOccupation}")
    public String deleteOccupation(@PathVariable int idOccupation){
        Occupation objOccupation = occupationService.getOccupation(idOccupation);

        if (objOccupation != null){
            occupationService.deleteOccupation(idOccupation);
        }

        return "La ocupacion se ha eliminado de forma correcta";
    }
}
