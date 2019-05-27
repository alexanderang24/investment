package com.doku.investment.dto;

import lombok.Data;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

/**
 * @author Laurence
 * @see Data
 * <p>
 * Model For Handle User Detail DTO
 * <p>
 * Anotation Data is for generating getter and setter
 */
@Data
public class UserDetailDto implements Serializable{
	
	/** serialVersionUID is for Communication over the network, converting the state of an object into a byte stream,
	 *  because network infrastructure and the hardware disks that understands bits and bytes but not JAVA objects.
	 *  <p>
	 *  Furthermore, serialVersionUID used for Lightweight persistence–the archival of an object
	 */
	private static final long serialVersionUID = -7790378562468911345L;
	
	private Long id;
    private Long userId;

	@NotBlank(message = "fullName is mandatory")
    private String fullName;
	
    private String job;
    private String country;
    private String city;
    private String dob;
    private String address;
    private String email;
    private String phone;
    private String linkPhoto;
    private String linkFB;
    private String linkIG;
    private String linkTwitter;
    private String skill;
    private String linkPhoto1;
    private String linkPhoto2;
    private String linkPhoto3;
    private String linkFriends1;
    private String linkFriends2;
    private String linkFriends3;
}
