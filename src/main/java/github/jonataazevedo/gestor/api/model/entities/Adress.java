package github.jonataazevedo.gestor.api.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@OneToMany(mappedBy = "id_person")
	private Person person;
}
