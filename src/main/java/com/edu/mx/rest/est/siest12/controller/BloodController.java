package com.edu.mx.rest.est.siest12.controller;

import com.edu.mx.rest.est.siest12.entity.Blood;
import com.edu.mx.rest.est.siest12.service.BloodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blood")
public class BloodController {

    private BloodService bloodService;

    public BloodController(BloodService bloodService) {
        this.bloodService = bloodService;
    }

    @GetMapping("/list")
    public List<Blood> bloods(){
        return bloodService.bloods();
    }

    @GetMapping("/list/{idBlood}")
    public Blood getBlood(@PathVariable int idBlood){
        return bloodService.getBlood(idBlood);
    }

    @PostMapping("/addBlood")
    public Blood saveBlood(@RequestBody Blood objBlood){
        objBlood.setIdBlood(0);
        bloodService.saveBlood(objBlood);
        return objBlood;
    }

    @PutMapping("/updateBlood")
    public Blood updateBlood(@RequestBody Blood objBlood){
        bloodService.saveBlood(objBlood);
        return objBlood;
    }

    @DeleteMapping("/delete/{idBlood}")
    public String deleteBlood(@PathVariable int idBlood){
        bloodService.deleteBlood(idBlood);
        return "El registro se a liminado de forma correcta en tabla SANGRE";
    }

}
