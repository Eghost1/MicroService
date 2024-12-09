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
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Estrategia_est_modeloDTO {

    private Long id;
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String alias;
    
    @NotBlank
    private String descripcion;
    
    @NotNull
    private Integer orden;
    
    @NotNull
    private Boolean aplicaSoloADepartamentos;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaRegistro;
     

}
