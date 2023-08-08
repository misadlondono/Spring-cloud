package com.gestorapp.migestor.dto;

import com.gestorapp.migestor.entity.UserEntity;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.Date;
import java.util.function.Function;

@Getter
@Setter
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String lastname;
    private String phone;
    private String email;
    private Date birthdate;

    public static final Function<UserDto, UserEntity> CONVERTER_ENTITY = (UserDto t ) -> {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(t.getId());
        userEntity.setName(t.getName());
        userEntity.setLastname(t.getLastname());
        userEntity.setPhone(t.getPhone());
        userEntity.setEmail(t.getEmail());
        userEntity.setBirthdate(t.getBirthdate());

        return userEntity;
    };

     public static final Function<UserEntity, UserDto> COVERTER_DTO = (UserEntity t) -> {
        UserDto userDto = new UserDto();
        userDto.setId(t.getId());
        userDto.setName(t.getName());
        userDto.setLastname(t.getLastname());
        userDto.setPhone(t.getPhone());
        userDto.setEmail(t.getEmail());
        userDto.setBirthdate(t.getBirthdate());

        return userDto;
    };


}
