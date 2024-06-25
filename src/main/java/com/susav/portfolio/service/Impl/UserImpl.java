package com.susav.portfolio.service.Impl;

import com.susav.portfolio.Dto.UserDto;
import com.susav.portfolio.Model.UserDetailsEntity;
import com.susav.portfolio.repository.UserRepository;
import com.susav.portfolio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserImpl implements UserService {

   UserRepository userRepository;

   public UserImpl(UserRepository userRepository) {
       this.userRepository = userRepository;
   }

    @Override
    public UserDto postEnquiry(UserDto userDto) {
       UserDetailsEntity userDetailsEntity = mapToEntity(userDto);
       UserDetailsEntity user= userRepository.save(userDetailsEntity);
        return mapToDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
       List<UserDetailsEntity> users = userRepository.findAll();
        return users.stream().map(page->mapToDto(page)).collect(Collectors.toList());
    }

    private UserDetailsEntity mapToEntity(UserDto dto){
        UserDetailsEntity userDetailsEntity = new UserDetailsEntity();
        userDetailsEntity.setName(dto.getName());
        userDetailsEntity.setEmail(dto.getEmail());
        userDetailsEntity.setDescription((dto.getDescription()));

        return userDetailsEntity;
    }

    private UserDto mapToDto(UserDetailsEntity entity){
        UserDto userDto = new UserDto();
        userDto.setId(entity.getId());
        userDto.setName(entity.getName());
        userDto.setEmail(entity.getEmail());
        userDto.setDescription(entity.getDescription());

        return userDto;
    }
}
