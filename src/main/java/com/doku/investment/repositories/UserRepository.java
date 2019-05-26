package com.doku.investment.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doku.investment.entities.User;

/**
 * @author Laurence
 * @see Repository
 * <p>
 * Repository For Handle User Repository
 * <p>
 * Anotation Repository is for managing database operations.
 * <p>
 * Extends CrudRepository is for have some methods for our data repository implemented, including findAll()
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
    List<User> findByUsername(String username);
    
}