package com.example.demo.controller;

import com.example.demo.model.in.giaoVienIn;
import com.example.demo.service.giaoVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/apiGV")
@CrossOrigin("*")
public class giaoVienController {

    @Autowired
    private giaoVienService giaoVienService;

    @GetMapping("")
    public ResponseEntity<?>getAll(){
        return new ResponseEntity<>(giaoVienService.getAllGV(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?>create(@RequestBody giaoVienIn giaoVienIn){
        return new ResponseEntity<>(giaoVienService.createGV(giaoVienIn),HttpStatus.CREATED);
    }

    @PutMapping("/update/{IdGV}")
    public ResponseEntity<?> update(@PathVariable Integer IdGV, @RequestBody giaoVienIn giaoVienIn){
        return new ResponseEntity<>(giaoVienService.updateGV(IdGV, giaoVienIn),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{IdGV}")
    public ResponseEntity<?> delete (@PathVariable Integer IdGV){
        return new ResponseEntity<>(giaoVienService.deleteGV(IdGV),HttpStatus.OK);
    }
}
