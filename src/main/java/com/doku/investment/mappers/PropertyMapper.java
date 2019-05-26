package com.doku.investment.mappers;

import java.util.Collection;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.doku.investment.dto.PropertyDto;
import com.doku.investment.entities.Property;

/**
 * @author Laurence
 * <p>
 * Mapper For Handle Mapping PropertyDTO and Property
 * <p>
 * Anotation Mapper is for Marks an interface or abstract class as a mapper 
 * and activates the generation of a implementation of that type viaMapStruct.
 * <p>
 * This mapper will automatically generate MapperImpl, but you should mvn clean install first,
 * don't work if just mvn install.
 * <p>
 * Anotation Mappings is for Array Mapping attribute (More than 1 Mapping)
 * <p>
 * Example : 
 * <pre>
 * &#64;Mappings({
 *   &#64;Mapping(target = "idDto", source = "property.id"),
 *   &#64;Mapping(target = "nameDto", source = "property.name")
 *   })
 * PropertyDto propertyToPropertyDto(Property property);
 * </pre>
 * Anotation Mapping is for Mapping attribute from ("source") to ("target").
 * This is used if the java object have different attributes name.
 */
@Mapper
public interface PropertyMapper {
	    
	PropertyMapper INSTANCE = Mappers.getMapper( PropertyMapper.class );
	
	@Mappings({
    @Mapping(target = "idDto", source = "property.id")
	})
    PropertyDto propertyToPropertyDto(Property property);
	
	@Mappings({
    @Mapping(target = "id", source = "propertyDto.idDto")
	})
    Property propertyDtoToProperty(PropertyDto propertyDto);
	
	List<PropertyDto> toListProperty(Collection<Property> properties);
}
