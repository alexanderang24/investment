package com.doku.investment.entities;

import java.io.Serializable;

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
 * Entities For Handle property Table
 * <p>
 * Anotation Entity is for mapping column table to java object
 * <p>
 * Anotation Data is for generating getter and setter
 * <p>
 * Anotation Table is for mapping to table database or for H2 to generate tabel using parameter name for table name, etc
 * <p>
 * Anotation GeneratedValue is for generating next value from this column
 * <p>
 * Anotation Column is for mapping to column table in database or for H2 to generate column tabel using parameter name for column name, etc
 */
@Entity
@Data
@Table(name = "property", schema="public")
public class Property implements Serializable{
		
	/** serialVersionUID is for Communication over the network, converting the state of an object into a byte stream,
	 *  because network infrastructure and the hardware disks that understands bits and bytes but not JAVA objects.
	 *  <p>
	 *  Furthermore, serialVersionUID used for Lightweight persistence–the archival of an object
	 */
	private static final long serialVersionUID = -4223805997132767337L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="property_id_seq")
    @Column(name="id")
    private int id;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name="name")
    private String name;
    
}
