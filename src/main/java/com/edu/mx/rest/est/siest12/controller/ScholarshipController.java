package com.edu.mx.rest.est.siest12.controller;

import com.edu.mx.rest.est.siest12.entity.Scholarship;
import com.edu.mx.rest.est.siest12.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beca")
public class ScholarshipController {

    private ScholarshipService scholarshipService;

    @Autowired
    public ScholarshipController(ScholarshipService scholarshipService) {
        this.scholarshipService = scholarshipService;
    }

    //Obtener lista
    @GetMapping("/list")
    public List<Scholarship> getScholarships(){
        return scholarshipService.getScholarships();
    }
    
    //Obtener solo un objeto de beca
    @GetMapping("/list/{idScholarship}")
    public Scholarship getScholarship(@PathVariable int idScholarship){
        return scholarshipService.getScholarship(idScholarship);
    }

    //Guardar beca
    @PostMapping("/add")
    public Scholarship addScholarship(@RequestBody Scholarship objScholarship){
        objScholarship.setIdScholarship(0);
        scholarshipService.addScholarship(objScholarship);
        return objScholarship;
    }
    
    //Actualizar beca
    @PutMapping("/update")
    public Scholarship updateScholarship(@RequestBody Scholarship objScholarship){
        scholarshipService.addScholarship(objScholarship);
        return objScholarship;
    }

    //Eliminar beca
    @DeleteMapping("/del/{idScholarship}")
    public String deleteScholarship(@PathVariable int idScholarship){
        Scholarship objScholarship = scholarshipService.getScholarship(idScholarship);

        if (objScholarship != null){
            scholarshipService.deleteScholarship(idScholarship);
        }

        return "Se ha eliminado de forma correcta la beca: " + idScholarship;
    }
}
