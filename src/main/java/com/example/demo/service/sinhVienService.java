//package com.example.demo.service;
//import com.example.demo.model.bo.responPage;
//import org.springframework.stereotype.Service;
//
//@Service
//public interface sinhVienService {
//    responPage getAll();
//
//
//}


package com.example.demo.service;

import com.example.demo.model.bo.respon;
import com.example.demo.model.bo.responPage;
import com.example.demo.model.in.sinhVienIn;
import org.springframework.stereotype.Service;

@Service

public interface sinhVienService {
    responPage getAll();

    respon create(sinhVienIn sinhVienIn);

    respon delete(Integer IdSV);

    respon update(Integer IdSV, sinhVienIn sinhVienIn);
}
