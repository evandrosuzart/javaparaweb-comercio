package br.com.javaparaweb.comercio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empregado")
public class Empregado implements Serializable {
	@Id
	@Column(name="cod_empregado")
	private Integer empregado;
}
