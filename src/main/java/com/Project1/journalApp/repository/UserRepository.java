package com.Project1.journalApp.repository;

import com.Project1.journalApp.entity.JournalEntry;
import com.Project1.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUsername(String username);
}
