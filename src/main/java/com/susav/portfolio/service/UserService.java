package com.susav.portfolio.service;

import com.susav.portfolio.Dto.UserDto;
import com.susav.portfolio.Model.UserDetailsEntity;

import java.util.List;

public interface UserService {

    UserDto postEnquiry(UserDto userDto);
    List<UserDto> getAllUsers();

}
