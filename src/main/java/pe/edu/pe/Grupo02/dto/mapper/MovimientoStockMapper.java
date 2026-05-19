package pe.edu.pe.Grupo02.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pe.edu.pe.Grupo02.dto.MovimientoStockDTO;
import pe.edu.pe.Grupo02.model.MovimientoStock;

@Mapper
public interface MovimientoStockMapper {
    MovimientoStockMapper INSTANCE = Mappers.getMapper(MovimientoStockMapper.class);

    @Mapping(source = "producto.id", target = "productoId")
    @Mapping(source = "producto.nombre", target = "productoNombre")
    MovimientoStockDTO toDTO(MovimientoStock movimiento);

    @Mapping(source = "productoId", target = "producto.id")
    @Mapping(ignore = true, target = "producto.nombre")
    @Mapping(ignore = true, target = "producto.categoria")
    @Mapping(ignore = true, target = "producto.precio")
    @Mapping(ignore = true, target = "producto.stockActual")
    @Mapping(ignore = true, target = "producto.stockMinimo")
    @Mapping(ignore = true, target = "producto.unidadMedida")
    @Mapping(ignore = true, target = "producto.ubicacion")
    @Mapping(ignore = true, target = "producto.activo")
    MovimientoStock toEntity(MovimientoStockDTO dto);
}
