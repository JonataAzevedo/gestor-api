package github.jonataazevedo.gestor.api.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adress implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@NotBlank
	@Column(nullable = false)
	private String cep;

	@NotBlank
	@Column(nullable = false)
	private String street;

	@NotBlank
	@Column(nullable = false)
	private Integer numHome;
	
	@NotBlank
	@Column(nullable = false)
	private String city;
	
	@ManyToOne
	@JoinColumn(name = "id_person", referencedColumnName = "id")
	private Person person;
}
