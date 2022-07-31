package github.jonataazevedo.gestor.api.model.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonResquestDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private LocalDate birthDate;
	
	private List<AddressRequestDTO> addresses;
}