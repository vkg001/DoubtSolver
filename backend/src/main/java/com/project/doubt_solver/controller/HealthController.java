package com.project.doubt_solver.controller;

import com.project.doubt_solver.payloads.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {
    @PostMapping("/health-checkup")
    public ResponseEntity<String> register(@RequestBody UserDto userDto){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
