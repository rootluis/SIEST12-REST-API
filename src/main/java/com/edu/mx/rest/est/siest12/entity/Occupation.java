package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.*;

@Entity
@Table(name = "TAB004_OCUPACION")
public class Occupation {

    @Id
    @SequenceGenerator(name = "seqOcupacion",sequenceName = "OCUPACION_SEQ",initialValue = 10000,allocationSize = 1)
    @GeneratedValue(generator = "seqOcupacion")
    @Column(name = "CD_OCUPACION")
    private int idOccupation;

    @Column(name = "TX_OCUPACION")
    private String nameOccupation;

    public Occupation() {
    }
    public Occupation(String nameOccupation) {
        this.nameOccupation = nameOccupation;
    }
    public int getIdOccupation() {
        return idOccupation;
    }

    public void setIdOccupation(int idOccupation) {
        this.idOccupation = idOccupation;
    }

    public String getNameOccupation() {
        return nameOccupation;
    }

    public void setNameOccupation(String nameOccupation) {
        this.nameOccupation = nameOccupation;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "idOccupation=" + idOccupation +
                ", nameOccupation='" + nameOccupation + '\'' +
                '}';
    }
}
