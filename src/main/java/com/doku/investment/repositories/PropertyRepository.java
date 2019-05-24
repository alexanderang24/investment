package com.doku.investment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doku.investment.entities.Property;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {
	
	@Query(value = "SELECT * FROM property;", nativeQuery = true)
	List<Property> getAllData();
}