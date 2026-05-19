package pe.edu.pe.Grupo02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedidoDTO {
    private int id;
    private int pedidoId;
    private int productoId;
    private String productoNombre;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
}
