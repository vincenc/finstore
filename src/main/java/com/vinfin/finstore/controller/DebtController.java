package com.vinfin.finstore.controller;

import com.vinfin.finstore.domain.Testdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/debt")
public class DebtController {


    @GetMapping
    public Testdata getDefault(){
        log.info("GetDefaul under debt controller {}", 123);
        return new Testdata("123", "345");
    }
}
