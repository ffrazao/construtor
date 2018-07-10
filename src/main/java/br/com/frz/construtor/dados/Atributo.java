package br.com.frz.construtor.dados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "atributo")
public class Atributo implements TemPai<Atributo> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private AtributoTipo tipo;
	
	@NotBlank
	private String codigo;
	
	@NotBlank
	private String nome;
	
	private String descricao;

	@ManyToOne
	private Atributo pai;

}