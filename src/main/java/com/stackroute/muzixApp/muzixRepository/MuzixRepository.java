package com.stackroute.muzixApp.muzixRepository;

import com.stackroute.muzixApp.muzix.Muzix;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MuzixRepository extends MongoRepository<Muzix,Integer> {

//    @Query("from Muzix where trackName=?1")
//    public Muzix searchByName(String trackName);

}
