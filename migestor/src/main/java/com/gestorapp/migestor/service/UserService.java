package com.gestorapp.migestor.service;

import com.gestorapp.migestor.entity.UserEntity;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserEntity> getUsers (Predicate predicate, Pageable pageable);

}
