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

import org.hibernate.validator.constraints.Range;

import lombok.Data;

/**
 * @author Laurence
 * @see Entity, Data
 * <p>
 * Entities For Handle user_tax Table
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
@Table(name = "user_tax", schema="public")
public class UserTax implements Serializable{
    
	/** serialVersionUID is for Communication over the network, converting the state of an object into a byte stream,
	 *  because network infrastructure and the hardware disks that understands bits and bytes but not JAVA objects.
	 *  <p>
	 *  Furthermore, serialVersionUID used for Lightweight persistence–the archival of an object
	 */
	private static final long serialVersionUID = -8947614973741408157L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="userTax_id_seq")
	@SequenceGenerator(sequenceName = "user_tax_id_seq", initialValue=200, allocationSize = 1, name = "userTax_id_seq")
    @Column(name="id")
    private Integer id;

	@Range(min=100, max=199, message="userDetailId is mandatory")
    @Column(name="userdetail_id")
	private Integer userDetailId;
	
	@NotBlank(message = "NPWP is mandatory")
    @Column(name="npwp")
	private String npwp;

    @Column(name="gender")
    private String gender;

    @Column(name="property")
    private String property;

    @Column(name="industry")
    private String industry;
}