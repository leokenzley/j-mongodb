package com.leokenzley.estudomongodb.repository;

import com.leokenzley.estudomongodb.document.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, String> {
}
