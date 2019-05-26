package com.doku.investment.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doku.investment.entities.UserDetail;

/**
 * @author Laurence
 * @see Repository
 * <p>
 * Repository For Handle User Detail Repository
 * <p>
 * Anotation Repository is for managing database operations.
 * <p>
 * Extends CrudRepository is for have some methods for our data repository implemented, including findAll()
 */
@Repository
public interface UserDetailRepository extends CrudRepository<UserDetail, Long> {
    
	UserDetail findByUserId(int userId);
    
}