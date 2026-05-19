package pe.edu.pe.Grupo02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlmacenDTO {
    private int id;
    private String nombre;
    private String direccion;
    private int filas;
    private int columnas;
    private List<UbicacionDTO> ubicaciones;
}
