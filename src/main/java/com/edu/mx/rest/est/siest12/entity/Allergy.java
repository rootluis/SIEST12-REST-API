package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB011_ALERGIA")
public class Allergy {

	@Id
	@SequenceGenerator(name = "seqAlergia", sequenceName = "ALERGIA_SEQ", initialValue = 10000, allocationSize = 100)
	@GeneratedValue(generator = "seqAlergia")
	@Column(name = "CD_ALERGIA")
	private int cdAlergia;

	@Column(name = "NB_ALERGIA")
	private String nbAlergia;

	public Allergy() {
	}

	public Allergy(String nbAlergia) {
		this.nbAlergia = nbAlergia;
	}

	public int getCdAlergia() {
		return cdAlergia;
	}

	public void setCdAlergia(int cdAlergia) {
		this.cdAlergia = cdAlergia;
	}

	public String getNbAlergia() {
		return nbAlergia;
	}

	public void setNbAlergia(String nbAlergia) {
		this.nbAlergia = nbAlergia;
	}

	@Override
	public String toString() {
		return "Alergia [cdAlergia=" + cdAlergia + ", nbAlergia=" + nbAlergia + "]";
	}
}
