package pe.edu.pe.Grupo02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private int id;
    private String nombre;
    private String dni;
    private String telefono;
    private String direccion;
}
