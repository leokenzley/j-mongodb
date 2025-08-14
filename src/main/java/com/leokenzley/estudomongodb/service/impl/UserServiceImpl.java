package com.leokenzley.estudomongodb.service.impl;

import com.leokenzley.estudomongodb.document.UserDocument;
import com.leokenzley.estudomongodb.repository.UserRepository;
import com.leokenzley.estudomongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository repository;

  @Override
  public List<UserDocument> findAll() {
    return List.of();
  }

  @Override
  public UserDocument findById(String id) {
    return null;
  }

  @Override
  public void create(UserDocument user) {
    repository.save(user);
  }

  @Override
  public void update(String id, UserDocument user) {

  }

  @Override
  public void delete(String id) {

  }
}
