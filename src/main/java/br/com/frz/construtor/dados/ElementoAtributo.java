package br.com.frz.construtor.dados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "elemento_atributo")
public class ElementoAtributo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "elemento_id")
	private Elemento elemento;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "atributo_id")
	private Atributo atributo;

	@NotBlank
	private Integer ordem;

	@Lob
	private String valor;

}