package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB009_AREA")
public class Area {

	@Id
	@SequenceGenerator(name = "seqArea", sequenceName = "AREA_SEQ", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "seqArea")
	@Column(name = "CD_AREA")
	private int cdArea;

	@Column(name = "TX_AREA")
	private String nameArea;

	public Area() {

	}

	public Area(String nameArea) {
		this.nameArea = nameArea;
	}

	public int getCdArea() {
		return cdArea;
	}

	public void setCdArea(int cdArea) {
		this.cdArea = cdArea;
	}

	public String getNameArea() {
		return nameArea;
	}

	public void setNameArea(String nameArea) {
		this.nameArea = nameArea;
	}

	@Override
	public String toString() {
		return "Area [cdArea=" + cdArea + ", nameArea=" + nameArea + "]";
	}

}
