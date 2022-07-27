package github.jonataazevedo.gestor.api.model.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
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

	@NotBlank
	@Column(nullable = false)
	private String CEP;

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
