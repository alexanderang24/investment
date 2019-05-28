package com.doku.investment.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.doku.investment.dto.UserDetailDto;
import com.doku.investment.entities.UserDetail;

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
 * <p>
 * Mapping in here is to convert type data from Date to String using custom format
 */
@Mapper
public interface UserDetailMapper {
	
	UserDetailMapper INSTANCE = Mappers.getMapper( UserDetailMapper.class );
	
	@Mapping(target="dob", source="dob", dateFormat="dd/MM/yyyy")
    UserDetailDto userDetailToUserDetailDto(UserDetail userDetail);
	
	@Mapping(target="dob", source="dob", dateFormat="yyyy-MM-dd")
    UserDetail userDetailDtoToUserDetail(UserDetailDto userDetailDto);
}
