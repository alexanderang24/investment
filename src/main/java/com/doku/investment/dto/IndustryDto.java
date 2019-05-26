package com.doku.investment.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Laurence
 * @see Data
 * <p>
 * Model For Handle Industry DTO
 * <p>
 * Anotation Data is for generating getter and setter
 */
@Data
public class IndustryDto implements Serializable{
	
	/** serialVersionUID is for Communication over the network, converting the state of an object into a byte stream,
	 *  because network infrastructure and the hardware disks that understands bits and bytes but not JAVA objects.
	 *  <p>
	 *  Furthermore, serialVersionUID used for Lightweight persistence–the archival of an object
	 */
	private static final long serialVersionUID = 4303102076422745976L;
	
	private int id;
    private String name;
    
    public IndustryDto(int id, String name){
        this.id   = id;
        this.name = name;
    }
}
