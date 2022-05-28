package com.vinfin.finstore.controller;

import com.vinfin.finstore.domain.Testdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debt")
public class DebtController {


    @GetMapping
    public Testdata getDefault(){
        return new Testdata("123", "345");
    }
}
