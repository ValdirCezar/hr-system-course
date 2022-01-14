package br.com.valdir.userapi.services;

import br.com.valdir.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
