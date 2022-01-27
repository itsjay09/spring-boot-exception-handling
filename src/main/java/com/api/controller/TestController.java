package com.api.controller;

import com.api.exceptions.type.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/data-one/{data}")
    public ResponseEntity<String> getData(@PathVariable String data) {

        if (data.equals("test") ) {
            return new ResponseEntity<>("Success ms-two", HttpStatus.OK);
        } else {
            throw new BadRequestException("Bad Request please param and try again");
        }
    }
}
