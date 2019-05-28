package com.doku.investment.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author Laurence
 * @see Data
 * <p>
 * Model For Handle User DTO
 * <p>
 * Anotation Data is for generating getter and setter
 */
@Data
public class UserDto implements Serializable{
	
	/** serialVersionUID is for Communication over the network, converting the state of an object into a byte stream,
	 *  because network infrastructure and the hardware disks that understands bits and bytes but not JAVA objects.
	 *  <p>
	 *  Furthermore, serialVersionUID used for Lightweight persistence–the archival of an object
	 */
	private static final long serialVersionUID = 1550979039720070466L;
	
	private Integer id;

    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Password is mandatory")
    private String password;
}
