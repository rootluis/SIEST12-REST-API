package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.*;

@Entity
@Table(name="TAB006_GRADO")
public class Grade {

    @Id
    @SequenceGenerator(name = "seqGrado", sequenceName = "GRADO_SEQ", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seqGrado")
    @Column(name = "CD_GRADO")
    private int idGrade;

    @Column(name = "TX_GRADO")
    private String nameGrade;

    public Grade() {

    }

    public Grade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    public int getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(int idGrade) {
        this.idGrade = idGrade;
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "idGrade=" + idGrade +
                ", nameGrade='" + nameGrade + '\'' +
                '}';
    }
}
