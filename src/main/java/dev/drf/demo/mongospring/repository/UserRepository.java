package dev.drf.demo.mongospring.repository;

import dev.drf.demo.mongospring.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findFirstByLogin(String login);
}
