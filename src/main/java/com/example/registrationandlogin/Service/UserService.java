package com.example.registrationandlogin.Service;


import com.example.registrationandlogin.model.User;
import com.example.registrationandlogin.web.Dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
