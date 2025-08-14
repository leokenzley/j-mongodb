package com.leokenzley.estudomongodb.service;

import com.leokenzley.estudomongodb.document.UserDocument;

import java.util.List;

public interface UserService {
  List<UserDocument> findAll();
  UserDocument findById(String id);
  void create(UserDocument user);
  void update(String id, UserDocument user);
  void delete(String id);
}
