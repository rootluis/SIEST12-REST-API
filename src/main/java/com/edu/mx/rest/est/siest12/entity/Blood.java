package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.*;

@Entity
@Table(name="TAB003_SANGRE")
public class Blood {

    @Id
    @SequenceGenerator(name = "seqBlood",sequenceName = "SANGRE_SEQ",allocationSize = 1,initialValue = 10)
    @GeneratedValue(generator = "seqBlood")
    @Column(name = "CD_SANGRE")
    private int idBlood;

    @Column(name = "TX_SANGRE")
    private String nameBlood;

    public Blood() {
    }

    public Blood(String nameBlood) {
        this.nameBlood = nameBlood;
    }

    public int getIdBlood() {
        return idBlood;
    }

    public void setIdBlood(int idBlood) {
        this.idBlood = idBlood;
    }

    public String getNameBlood() {
        return nameBlood;
    }

    public void setNameBlood(String nameBlood) {
        this.nameBlood = nameBlood;
    }

    @Override
    public String toString() {
        return "Blood{" +
                "idBlood=" + idBlood +
                ", nameBlood='" + nameBlood + '\'' +
                '}';
    }
}
