package com.doku.investment.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

/**
 * @author Laurence
 * @see Entity, Data
 * <p>
 * Entities For Handle user_detail Table
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
@Table(name = "user_detail", schema="public")
public class UserDetail implements Serializable{
    
	/** serialVersionUID is for Communication over the network, converting the state of an object into a byte stream,
	 *  because network infrastructure and the hardware disks that understands bits and bytes but not JAVA objects.
	 *  <p>
	 *  Furthermore, serialVersionUID used for Lightweight persistence–the archival of an object
	 */
	private static final long serialVersionUID = -6693899871655215816L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="userDetail_id_seq")
	@SequenceGenerator(sequenceName = "user_detail_id_seq", initialValue=100, allocationSize = 1, name = "userDetail_id_seq")
    @Column(name="id")
	private Integer id;
	
	@Range(min=1, max=99, message="userId is mandatory")
    @Column(name="user_id")
    private Integer userId;
	
	@NotBlank(message = "fullName is mandatory")
    @Column(name="full_name")
    private String fullName;
	
    @Column(name="job")
    private String job;
    
    @Column(name="country")
    private String country;

    @Column(name="city")
    private String city;

    @Column(name="dob")
    private Date dob;

    @Column(name="address")
    private String address;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="link_photo")
    private String linkPhoto;

    @Column(name="link_fb")
    private String linkFB;

    @Column(name="link_ig")
    private String linkIG;

    @Column(name="link_twitter")
    private String linkTwitter;

    @Column(name="skill")
    private String skill;

    @Column(name="link_photo1")
    private String linkPhoto1;

    @Column(name="link_photo2")
    private String linkPhoto2;

    @Column(name="link_photo3")
    private String linkPhoto3;

    @Column(name="link_friends1")
    private String linkFriends1;

    @Column(name="link_friends2")
    private String linkFriends2;

    @Column(name="link_friends3")
    private String linkFriends3;
}