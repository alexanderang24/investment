package com.doku.investment.entities.model;

import lombok.Data;

/**
 * @author Laurence
 * @see Data
 * <p>
 * Model For Handle Industry DTO
 * <p>
 * Anotation Entity is for mapping column table to java object
 * <p>
 * Anotation Data is for generating getter and setter
 * <p>
 * Anotation GeneratedValue is for generating next value from this column
 */
@Data
public class IndustryDTO {
    private int id;
    private String name;
    
    public IndustryDTO(int id, String name){
        this.id   = id;
        this.name = name;
    }
}
