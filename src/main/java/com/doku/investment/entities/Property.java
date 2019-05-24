package com.doku.investment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author Laurence
 * @see Entity, Data
 * <p>
 * Entities For Handle User Table
 * <p>
 * Anotation Entity is for mapping column table to java object
 * <p>
 * Anotation Data is for generating getter and setter
 * <p>
 * Anotation GeneratedValue is for generating next value from this column
 */
@Entity
@Data
@Table(name = "property", schema="public")
public class Property {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="property_id_seq")
    @Column(name="id")
    private int id;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name="name")
    private String name;
    
}
