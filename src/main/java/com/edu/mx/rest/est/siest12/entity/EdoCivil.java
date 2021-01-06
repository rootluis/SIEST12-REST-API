package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.*;

@Entity
@Table(name = "TAB002_ESTADO_CIVIL")
public class EdoCivil {

    @Id
    @SequenceGenerator(name = "seqEdoCivil", sequenceName = "EDO_CIVIL_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "seqEdoCivil")
    @Column(name = "CD_EDO_CIVIL")
    private int idEdoCivil;

    @Column(name = "TX_EDO_CIVIL")
    private String nameEdoCivil;

    public EdoCivil() {
    }

    public EdoCivil(String nameEdoCivil) {
        this.nameEdoCivil = nameEdoCivil;
    }

    public int getIdEdoCivil() {
        return idEdoCivil;
    }

    public void setIdEdoCivil(int idEdoCivil) {
        this.idEdoCivil = idEdoCivil;
    }

    public String getNameEdoCivil() {
        return nameEdoCivil;
    }

    public void setNameEdoCivil(String nameEdoCivil) {
        this.nameEdoCivil = nameEdoCivil;
    }

    @Override
    public String toString() {
        return "EdoCivil{" +
                "idEdoCivil=" + idEdoCivil +
                ", nameEdoCivil='" + nameEdoCivil + '\'' +
                '}';
    }
}
