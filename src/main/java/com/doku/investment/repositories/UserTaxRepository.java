package com.doku.investment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doku.investment.entities.User;
import com.doku.investment.entities.UserTax;

/**
 * @author Laurence
 * @see Repository
 * <p>
 * Repository For Handle User Tax Repository
 * <p>
 * Anotation Repository is for managing database operations.
 * <p>
 * Extends CrudRepository is for have some methods for our data repository implemented, including findAll()
 */
@Repository
public interface UserTaxRepository extends CrudRepository<UserTax, Long> {
	
	@Query(value = "SELECT user_tax_id_seq.nextval FROM user_tax", nativeQuery = true)
	Integer getNextVal();
    
}