package br.com.frz.construtor.entidade;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "elemento")
public class Elemento implements _TemPai<Elemento> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "elemento_tipo_id")
	private ElementoTipo tipo;

	@NotBlank
	private String codigo;

	@NotBlank
	private String nome;

	private String descricao;

	@ManyToOne
	@JoinColumn(name = "pai_id")
	private Elemento pai;

	@NotNull
	@OneToMany(mappedBy = "elemento")
	private Collection<Atributo> atributoCollection;

}