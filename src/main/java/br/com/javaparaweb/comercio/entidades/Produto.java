package br.com.javaparaweb.comercio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1794663692400039725L;
	
	@Id
	@GeneratedValue
	@Column(name="cod_produto")
	private Integer produto;
	private String descricao;
	private Float preco;
	
	@ManyToOne
	@JoinColumn(name="cod_categoria")
	private Categoria categoria;

}
