package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Clone;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author desaextremo
 */
public interface CloneCrudRepository extends MongoRepository<Clone, Integer> {
    
}
