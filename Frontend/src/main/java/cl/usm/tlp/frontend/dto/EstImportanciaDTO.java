package cl.usm.tlp.frontend.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EstImportanciaDTO {
	
	private Long id;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String alias;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private Date fecha_registro;
}
