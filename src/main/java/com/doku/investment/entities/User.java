package com.doku.investment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author Laurence
 * @see Entity, Data
 * <p>
 * Entities For Handle User Table
 * <p>
 * Anotation Entity is for 
 * <p>
 * Anotation GetMapping is the newer annotation
 * for RequestMapping(method = RequestMethod.GET), used to map web requests onto specific handler classes and/or handler methods.
 * <p>
 * Anotation PostMapping is the newer annotation
 * for RequestMapping(method = RequestMethod.POST), used to map web requests onto specific handler classes and/or handler methods.
 */
@Entity
@Data
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="user_id_seq")
    @Column(name="id")
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name="name")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    @Column(name="email")
    private String email;
    
    @NotBlank(message = "Password is mandatory")
    @Column(name="password")
    private String password;

    @NotBlank(message = "NPWP is mandatory")
    @Column(name="npwp")
    private long npwp;
}