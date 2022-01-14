package br.com.valdir.userapi.services.impl;

import br.com.valdir.userapi.domain.User;
import br.com.valdir.userapi.repositories.UserRepository;
import br.com.valdir.userapi.services.UserService;
import br.com.valdir.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
