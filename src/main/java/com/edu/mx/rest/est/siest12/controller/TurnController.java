package com.edu.mx.rest.est.siest12.controller;

import com.edu.mx.rest.est.siest12.entity.Turn;
import com.edu.mx.rest.est.siest12.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/turn")
public class TurnController {

    private TurnService turnService;

    @Autowired
    public TurnController(TurnService turnService) {
        this.turnService = turnService;
    }

    @GetMapping("/list")
    public List<Turn> getTurns(){
        return turnService.turns();
    }

    @GetMapping("/list/{idTurn}")
    public Turn getTurn(@PathVariable int idTurn){
        Turn theTurn = turnService.getTurn(idTurn);
        if (theTurn == null){
            throw new RuntimeException("Error desde el controlador al intentar obtener el TURNO");
        }
        return theTurn;
    }

    @PostMapping("/turn")
    public Turn saveTurn(@RequestBody Turn theTurn){
        theTurn.setIdTurn(0);
        turnService.saveTurn(theTurn);
        return theTurn;
    }

    @PutMapping("/turn")
    public Turn updateTurn(@RequestBody Turn theTurn){
        turnService.saveTurn(theTurn);
        return theTurn;
    }

    @DeleteMapping("/turn/{idTurn}")
    public String deleteTurn(@PathVariable int idTurn){
        Turn theTurn = turnService.getTurn(idTurn);

        if (theTurn == null){
            throw new RuntimeException("No se encontro el turno a Eliminar");
        }

        turnService.deleteTurn(idTurn);
        return "El turno se ha eliminado de forma correcta";
    }

}
