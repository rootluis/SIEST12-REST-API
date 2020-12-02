package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.*;

@Entity
@Table(name = "TAB005_PARENTESCO")
public class Relationship {

    @Id
    @SequenceGenerator(name = "seqParentesco", sequenceName = "PARENTESCO_SEQ", allocationSize = 1, initialValue = 10)
    @GeneratedValue(generator = "seqParentesco")
    @Column(name = "CD_PARENTESCO")
    private int idRelationship;

    @Column(name = "NB_PARENTESCO")
    private String nameRelationship;

    public Relationship(){

    }

    public Relationship(String nameRelationship) {
        this.nameRelationship = nameRelationship;
    }

    public int getIdRelationship() {
        return idRelationship;
    }

    public void setIdRelationship(int idRelationship) {
        this.idRelationship = idRelationship;
    }

    public String getNameRelationship() {
        return nameRelationship;
    }

    public void setNameRelationship(String nameRelationship) {
        this.nameRelationship = nameRelationship;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "idRelationship=" + idRelationship +
                ", nameRelationship='" + nameRelationship + '\'' +
                '}';
    }
}
