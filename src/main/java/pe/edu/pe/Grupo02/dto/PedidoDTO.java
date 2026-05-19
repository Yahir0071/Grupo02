package pe.edu.pe.Grupo02.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {
    private int id;
    private int clienteId;
    private String clienteNombre;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime fecha;
    private String estado;
    private double total;
    private int prioridad;
    private int cantidadProductos;
    private List<DetallePedidoDTO> detalles;
}
