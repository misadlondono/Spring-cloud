package com.gestorapp.migestor.controller;

import com.gestorapp.migestor.dto.UserDto;
import com.gestorapp.migestor.entity.UserEntity;
import com.gestorapp.migestor.service.UserService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value= "/obtenerUsuarios")
    private ResponseEntity <Page<UserDto>> getUsers(@QuerydslPredicate(root = com.gestorapp.migestor.entity.UserEntity.class) Predicate predicate, Pageable pageable,
                                                    @RequestParam(required = false) boolean isPaged){
        Page<UserEntity> userPage = userService.getUsers(predicate, isPaged ? pageable : Pageable.unpaged());

        if (userPage == null) {
            return  ResponseEntity.ok(Page.empty());
        }
        Page<UserDto> userDtoPage = new PageImpl<>(userPage.getContent().stream().map(UserDto.COVERTER_DTO).collect(Collectors.<UserDto>toList()),
                                                   pageable,userPage.getTotalElements());
        return ResponseEntity.ok(userDtoPage);

    }


}
