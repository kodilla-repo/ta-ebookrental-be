package com.kodilla.ebooklibrary.controller;

import com.kodilla.ebooklibrary.domain.dto.LoginDto;
import com.kodilla.ebooklibrary.domain.dto.RegisteredDto;
import com.kodilla.ebooklibrary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/user/")
class UserController {
  @Autowired
  private UserService userService;

  @PostMapping(path = "login")
  public long login(@RequestBody LoginDto loginDto) {
    return userService.login(loginDto);
  }

  @PostMapping(path = "register")
  public RegisteredDto register(@RequestBody LoginDto loginDto) {
    return userService.register(loginDto);
  }
}
