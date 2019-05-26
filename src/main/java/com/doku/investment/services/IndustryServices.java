package com.doku.investment.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.doku.investment.dto.IndustryDto;

/**
 * @author Laurence
 * Service For Handle Industry Service
 * <p>
 * This interface will be used in Impl File using override
 */
public interface IndustryServices {
	List<IndustryDto> getListIndustry();
}
