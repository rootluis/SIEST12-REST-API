package com.edu.mx.rest.est.siest12.service;

import com.edu.mx.rest.est.siest12.entity.Turn;

import java.util.List;

public interface TurnService {

    public List<Turn> turns();

    public Turn getTurn(int idTurn);

    public void saveTurn(Turn theTurn);

    public void deleteTurn(int idTurn);

}
