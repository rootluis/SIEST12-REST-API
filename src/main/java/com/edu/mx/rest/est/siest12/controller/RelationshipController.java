package com.edu.mx.rest.est.siest12.controller;

import com.edu.mx.rest.est.siest12.entity.Relationship;
import com.edu.mx.rest.est.siest12.service.RelationshipService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relationship")
public class RelationshipController {

    private RelationshipService relationshipService;

    public RelationshipController(RelationshipService relationshipService) {
        this.relationshipService = relationshipService;
    }

    // get all
    @GetMapping("/list")
    public List<Relationship> relationships(){
        return relationshipService.relationships();
    }

    // get obj
    @GetMapping("/list/{idRelationship}")
    public Relationship getRelationship(@PathVariable int idRelationship){
        return relationshipService.getRelationship(idRelationship);
    }

    // save obj
    @PostMapping("/save")
    public Relationship saveRelationship(@RequestBody Relationship objRelationship){
        relationshipService.saveRelationship(objRelationship);
        return objRelationship;
    }
    // update obj
    @PutMapping("/update")
    public Relationship updateRelationship(@RequestBody Relationship objRelationship){
        relationshipService.updateRelationship(objRelationship);
        return objRelationship;
    }

    // delete obj
    @DeleteMapping("/delete/{idRelationship}")
    public String deleteRelationship(@PathVariable int idRelationship){
        relationshipService.deleteRelationship(idRelationship);
        return "El parentesco se elimino de forma correcta";
    }
}
