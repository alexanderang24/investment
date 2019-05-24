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
@Table(name = "user", schema="public")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="user_id_seq")
    @Column(name="id")
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name="username")
    private String username;
   
    @NotBlank(message = "Password is mandatory")
    @Column(name="password")
    private String password;
}