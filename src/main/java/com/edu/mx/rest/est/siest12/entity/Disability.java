package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB008_DISCAPACIDAD")
public class Disability {

	@Id
	@SequenceGenerator(name = "seqDisability", sequenceName = "DISCAPACIDAD_SEQ", initialValue = 10, allocationSize = 1)
	@GeneratedValue(generator = "seqDisability")
	@Column(name = "CD_DISCAPACIDAD")
	private int idDisability;

	@Column(name = "TX_DISCAPACIDAD")
	private String nameDisability;

	public Disability() {

	}

	public Disability(String nameDisability) {
		this.nameDisability = nameDisability;
	}

	public int getIdDisability() {
		return idDisability;
	}

	public void setIdDisability(int idDisability) {
		this.idDisability = idDisability;
	}

	public String getNameDisability() {
		return nameDisability;
	}

	public void setNameDisability(String nameDisability) {
		this.nameDisability = nameDisability;
	}

	@Override
	public String toString() {
		return "Disability [idDisability=" + idDisability + ", nameDisability=" + nameDisability + "]";
	}

}
