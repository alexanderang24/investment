package com.doku.investment.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author Laurence
 * @see Data
 * <p>
 * Model For Handle User Tax DTO
 * <p>
 * Anotation Data is for generating getter and setter
 */
@Data
public class UserTaxDto implements Serializable{
	
	/** serialVersionUID is for Communication over the network, converting the state of an object into a byte stream,
	 *  because network infrastructure and the hardware disks that understands bits and bytes but not JAVA objects.
	 *  <p>
	 *  Furthermore, serialVersionUID used for Lightweight persistence–the archival of an object
	 */
	private static final long serialVersionUID = -6151157605885698050L;
	
    private int id;
    
    private int userDetailId;

	@NotBlank(message = "NPWP is mandatory")
	private String npwp;

    private String gender;

    private String property;

    private String industry;
}
