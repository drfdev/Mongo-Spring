package dev.drf.demo.mongospring.repository;

import dev.drf.demo.mongospring.model.Monster;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MonsterRepository extends MongoRepository<Monster, ObjectId> {

    Optional<Monster> findFirstByName(String name);

    @Query("{\"name\": { $regex: ?0}}")
    List<Monster> searchByRegExpName(String name);
}
