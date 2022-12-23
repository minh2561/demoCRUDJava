package com.example.demo.service;

import com.example.demo.model.bo.respon;
import com.example.demo.model.bo.responPage;
import com.example.demo.model.in.giaoVienIn;
import org.springframework.stereotype.Service;

@Service
public interface giaoVienService {
    responPage getAllGV();

    respon createGV(giaoVienIn giaoVienIn);

    respon updateGV(Integer IdGV, giaoVienIn giaoVienIn);

    respon deleteGV(Integer IdGV);

}
