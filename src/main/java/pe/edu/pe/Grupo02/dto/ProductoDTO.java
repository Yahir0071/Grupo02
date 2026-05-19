package pe.edu.pe.Grupo02.dto;

import lombok.Data;

@Data
public class ProductoDTO {
    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private int stockActual;
    private int stockMinimo;
    private String unidadMedida;
    private boolean activo;
    
    // ID de la ubicación para las peticiones (Request)
    private int ubicacionId;
    
    // Nombre de la ubicación para las respuestas (Response)
    private String nombreUbicacion;
}