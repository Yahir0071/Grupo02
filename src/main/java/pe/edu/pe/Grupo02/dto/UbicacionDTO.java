package pe.edu.pe.Grupo02.dto;

import lombok.Data;

@Data
public class UbicacionDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private int almacenId;
    private String almacenNombre;
}