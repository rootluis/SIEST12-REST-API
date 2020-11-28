package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.*;

@Entity
@Table(name = "TAB001_TURNO")
public class Turn {

    @Id
    @SequenceGenerator(name = "seqTurn", sequenceName = "TURNO_SEQ", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seqTurn")
    @Column(name = "CD_TURNO")
    private int idTurn;

    @Column(name = "TX_TURNO")
    private String nameTurn;

    public Turn() {
    }

    public Turn(String nameTurn) {
        this.nameTurn = nameTurn;
    }

    public int getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(int idTurn) {
        this.idTurn = idTurn;
    }

    public String getNameTurn() {
        return nameTurn;
    }

    public void setNameTurn(String nameTurn) {
        this.nameTurn = nameTurn;
    }

    @Override
    public String toString() {
        return "Turn{" +
                "idTurn=" + idTurn +
                ", nameTurn='" + nameTurn + '\'' +
                '}';
    }
}
