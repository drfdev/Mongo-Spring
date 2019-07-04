package dev.drf.demo.mongospring.repository;

import dev.drf.demo.mongospring.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
}
