package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.*;

@Entity
@Table(name="TAB007_BECA")
public class Scholarship {

    @Id
    @SequenceGenerator(name = "seqBeca", sequenceName = "BECA_SEQ", initialValue = 10000, allocationSize = 1)
    @GeneratedValue(generator = "seqBeca")
    @Column(name = "CD_BECA")
    private int idScholarship;

    @Column(name = "TX_BECA")
    private String nameScholarship;

    public Scholarship() {

    }

    public Scholarship(String nameScholarship) {
        this.nameScholarship = nameScholarship;
    }

    public int getIdScholarship() {
        return idScholarship;
    }

    public void setIdScholarship(int idScholarship) {
        this.idScholarship = idScholarship;
    }

    public String getNameScholarship() {
        return nameScholarship;
    }

    public void setNameScholarship(String nameScholarship) {
        this.nameScholarship = nameScholarship;
    }

    @Override
    public String toString() {
        return "Scholarship{" +
                "idScholarship=" + idScholarship +
                ", nameScholarship='" + nameScholarship + '\'' +
                '}';
    }
}
