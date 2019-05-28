package com.doku.investment.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author Laurence
 * @see Entity, Data
 * <p>
 * Entities For Handle user Table
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
@Table(name = "user", schema="public")
public class User implements Serializable{
    
	/** serialVersionUID is for Communication over the network, converting the state of an object into a byte stream,
	 *  because network infrastructure and the hardware disks that understands bits and bytes but not JAVA objects.
	 *  <p>
	 *  Furthermore, serialVersionUID used for Lightweight persistence–the archival of an object
	 */
	private static final long serialVersionUID = -3151924490495766088L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="userId_seq")
	@SequenceGenerator(sequenceName = "user_id_seq", initialValue=2, allocationSize = 1, name = "userId_seq")
    @Column(name="id")
    private Integer id;
    
    @NotBlank(message = "Username is mandatory")
    @Column(name="username")
    private String username;
   
    @NotBlank(message = "Password is mandatory")
    @Column(name="password")
    private String password;
}