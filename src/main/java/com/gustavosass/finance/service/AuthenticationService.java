package com.gustavosass.finance.service;

import com.gustavosass.finance.dtos.LoginUserDTO;
import com.gustavosass.finance.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    public User authenticate(LoginUserDTO loginUserDto) {
    	
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                		loginUserDto.getUsername(),
                		loginUserDto.getPassword()
                )
        );

        return userService.findByUsername(loginUserDto.getUsername());
    }
}
