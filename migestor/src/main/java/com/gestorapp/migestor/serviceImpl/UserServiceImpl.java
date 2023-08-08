package com.gestorapp.migestor.serviceImpl;

import com.gestorapp.migestor.entity.UserEntity;
import com.gestorapp.migestor.repository.UserRepository;
import com.gestorapp.migestor.service.UserService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Page<UserEntity> getUsers(Predicate predicate, Pageable pageable) {
        return  userRepository.findAll(predicate, pageable);
    }

}
