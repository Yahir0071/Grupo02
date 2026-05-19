package pe.edu.pe.Grupo02.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pe.edu.pe.Grupo02.dto.AlmacenDTO;
import pe.edu.pe.Grupo02.model.Almacen;

@Mapper(uses = {UbicacionMapper.class})
public interface AlmacenMapper {
    AlmacenMapper INSTANCE = Mappers.getMapper(AlmacenMapper.class);

    AlmacenDTO toDTO(Almacen almacen);

    @Mapping(ignore = true, target = "ubicaciones")
    Almacen toEntity(AlmacenDTO dto);
}
