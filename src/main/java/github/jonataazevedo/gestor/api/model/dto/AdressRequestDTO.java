package github.jonataazevedo.gestor.api.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdressRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cep;

	private String street;

	private Integer numHome;

	private String city;
}
