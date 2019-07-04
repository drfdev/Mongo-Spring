package dev.drf.demo.mongospring.repository;

import dev.drf.demo.mongospring.model.Monster;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MonsterRepository extends MongoRepository<Monster, ObjectId> {
}
