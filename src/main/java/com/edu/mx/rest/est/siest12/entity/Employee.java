package com.edu.mx.rest.est.siest12.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB010_EMPLEADO")
public class Employee {

	@Id
	@SequenceGenerator(name = "seqEmployee", sequenceName = "EMPLEADO_SEQ", initialValue = 10, allocationSize = 1)
	@GeneratedValue(generator = "seqEmployee")
	@Column(name = "CD_EMPLEADO")
	private int cdEmployee;

	@Column(name = "TX_EMPLEADO")
	private String nbEmpleado;

	public Employee() {

	}

	public Employee(String nbEmpleado) {
		this.nbEmpleado = nbEmpleado;
	}

	public int getCdEmployee() {
		return cdEmployee;
	}

	public void setCdEmployee(int cdEmployee) {
		this.cdEmployee = cdEmployee;
	}

	public String getNbEmpleado() {
		return nbEmpleado;
	}

	public void setNbEmpleado(String nbEmpleado) {
		this.nbEmpleado = nbEmpleado;
	}

	@Override
	public String toString() {
		return "Employee [cdEmployee=" + cdEmployee + ", nbEmpleado=" + nbEmpleado + "]";
	}

}
