package com.doku.investment.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.doku.investment.entities.model.IndustryDTO;
import com.doku.investment.services.IndustryServices;

@Service
public class IndustryServicesImpl implements IndustryServices{
	
	@Override
	public List<IndustryDTO> getListIndustry(){
		List<IndustryDTO> industries = new ArrayList <>();
    	
    	industries.add(new IndustryDTO(1, "Financial Technology"));
    	industries.add(new IndustryDTO(2, "Telecomunication"));
    	industries.add(new IndustryDTO(3, "Insurance"));
    	industries.add(new IndustryDTO(4, "Security"));
    	
    	return industries;
	}
}
