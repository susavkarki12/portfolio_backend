package com.susav.portfolio.controller;

import com.susav.portfolio.Dto.UserDto;
import com.susav.portfolio.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/post")
public class UserEnquiryController {

    UserService userService;

    public UserEnquiryController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDto> postEnquiry(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.postEnquiry(userDto), HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public List<UserDto> getEnquiry() {
        return userService.getAllUsers();
    }
}
