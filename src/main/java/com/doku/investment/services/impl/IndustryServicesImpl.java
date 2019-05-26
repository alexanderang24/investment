package com.doku.investment.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.doku.investment.dto.IndustryDto;
import com.doku.investment.services.IndustryServices;

/**
 * @author Laurence
 * @see Service, Override
 * <p>
 * Implementation Service For Handle Industry
 * <p>
 * Anotation Service is to write business logic in a different layer, separated from RestController class file.
 * <p>
 * This annotation need to write in service layer if some file using anotation autowired.
 * <p>
 * Anotation Override is for replace method parent (class from implements) to provide a specific implementation of 
 * a method that is already provided by one of its super-classes or parent classes.
 */
@Service
public class IndustryServicesImpl implements IndustryServices{
	
	@Override
	public List<IndustryDto> getListIndustry(){
		List<IndustryDto> industries = new ArrayList <>();
    	
    	industries.add(new IndustryDto(1, "Financial Technology"));
    	industries.add(new IndustryDto(2, "Telecomunication"));
    	industries.add(new IndustryDto(3, "Insurance"));
    	industries.add(new IndustryDto(4, "Security"));
    	
    	return industries;
	}
}
