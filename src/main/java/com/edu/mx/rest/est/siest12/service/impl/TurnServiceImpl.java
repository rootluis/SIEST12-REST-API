package com.edu.mx.rest.est.siest12.service.impl;

import com.edu.mx.rest.est.siest12.dao.TurnRepository;
import com.edu.mx.rest.est.siest12.entity.Turn;
import com.edu.mx.rest.est.siest12.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnServiceImpl implements TurnService {

    private TurnRepository turnRepository;

    @Autowired
    public TurnServiceImpl(TurnRepository turnRepository){
        this.turnRepository = turnRepository;
    }

    @Override
    public List<Turn> turns() {
        return turnRepository.findAll();
    }

    @Override
    public Turn getTurn(int idTurn) {
        Optional<Turn> optTurn = turnRepository.findById(idTurn);
        Turn theTurn = null;

        if (optTurn.isPresent()){
            theTurn = optTurn.get();
        }else{
            throw new RuntimeException("No se encontro el TURNO: " + idTurn);
        }

        return theTurn;
    }

    @Override
    public void saveTurn(Turn theTurn) {
        turnRepository.save(theTurn);
    }

    @Override
    public void deleteTurn(int idTurn) {
        turnRepository.deleteById(idTurn);
    }
}
