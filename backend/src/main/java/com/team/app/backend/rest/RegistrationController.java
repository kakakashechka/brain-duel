package com.team.app.backend.rest;

import com.team.app.backend.exception.UserAlreadyExistsException;
import com.team.app.backend.dto.UserRegistrationDto;
import com.team.app.backend.persistance.dao.UserDao;
import com.team.app.backend.persistance.model.User;
import com.team.app.backend.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api")
public class RegistrationController {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @Autowired
    UserDao userDao;

    @PostMapping("/sign-up")
    public ResponseEntity<String> registerUserAccount(
            @RequestBody UserRegistrationDto userDto) {

        try {
            userService.registerNewUserAccount(userDto);
        } catch (UserAlreadyExistsException e) {
            return new ResponseEntity<>(
                    "User with username " + userDto.getUsername() + " already exists.",
                    HttpStatus.CONFLICT
            );
        }
        return new ResponseEntity<>(
                "User with username " + userDto.getUsername() + " successfully registered.",
                HttpStatus.OK
        );
    }




    @GetMapping("/resource")
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    @GetMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/";
    }

}
