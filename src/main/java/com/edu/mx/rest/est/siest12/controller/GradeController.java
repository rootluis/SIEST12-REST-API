package com.edu.mx.rest.est.siest12.controller;

import com.edu.mx.rest.est.siest12.entity.Grade;
import com.edu.mx.rest.est.siest12.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeController {

    private GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/list")
    public List<Grade> getGrades(){
        return gradeService.getGrades();
    }

    @GetMapping("/list/{idGrade}")
    public Grade getGrade(@PathVariable int idGrade){
        return gradeService.getGrade(idGrade);
    }

    @PostMapping("/add")
    public Grade addGrade(@RequestBody Grade objGrade){
        objGrade.setIdGrade(0);
        gradeService.addGrade(objGrade);
        return objGrade;
    }

    @PutMapping("/update")
    public Grade updateGrade(@RequestBody Grade objGrade){
        gradeService.addGrade(objGrade);
        return objGrade;
    }

    @DeleteMapping("/delete/{idGrade}")
    public String deleteGrade(@PathVariable int idGrade){
        Grade objGrade = gradeService.getGrade(idGrade);

        if (objGrade != null){
            gradeService.deleteGrade(idGrade);
        }

        return "El grado se ha eliminado de forma correcta";
    }
}
