//package com.example.demo.controller;
//
//import com.example.demo.service.sinhVienService;
//import lombok.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//
//@Controller
//@RequestMapping("/api")
//@CrossOrigin("*")
//
//public class sinhVienController {
//    @Autowired
//    private sinhVienService sinhVienService;
//
//    @GetMapping(value = "")
//    public ResponseEntity<?> getAll() {
//
//        return new ResponseEntity<>(sinhVienService.getAll(), HttpStatus.OK);
//    }
//
//}

package com.example.demo.controller;

import com.example.demo.model.in.sinhVienIn;
import com.example.demo.service.sinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/apiSV")
@CrossOrigin
public class sinhVienController {
    @Autowired
    private sinhVienService sinhVienService;

    @GetMapping(value = "")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(sinhVienService.getAll(), HttpStatus.OK);
    }

    @PostMapping(value = "")// nhan request
    public ResponseEntity<?> create(@RequestBody sinhVienIn sinhVienIn) {
        return new ResponseEntity<>(sinhVienService.create(sinhVienIn), HttpStatus.CREATED);
    }


    @DeleteMapping(value = "/delete/{IdSV}")
    public ResponseEntity<?> delete(@PathVariable Integer IdSV) {
        return new ResponseEntity<>(sinhVienService.delete(IdSV), HttpStatus.OK);
    }


    @PutMapping(value = "/update/{IdSV}")
    public ResponseEntity<?> update(@PathVariable Integer IdSV, @RequestBody sinhVienIn sinhVienIn) {
        return new ResponseEntity<>(sinhVienService.update(IdSV, sinhVienIn), HttpStatus.OK);
    }
}