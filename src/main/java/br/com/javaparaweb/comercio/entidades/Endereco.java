package br.com.javaparaweb.comercio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6146162020804865991L;
	@Id
	@GeneratedValue(generator="fk_endereco_cod_cliente")
	
	@org.hibernate.annotations.GenericGenerator(name="fk_endereco_cod_cliente",strategy="foreign"
	,parameters = @Parameter(name="property",value="cliente"))
	@Column(name="cod_cliente")
	private Integer endereco;
	
}