package br.com.frz.construtor.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "atributo_tipo")
public class AtributoTipo implements _TemPai<AtributoTipo> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	private String codigo;

	@NotBlank
	private String nome;

	private String descricao;

	@ManyToOne
	@JoinColumn(name = "pai_id")
	private AtributoTipo pai;

}