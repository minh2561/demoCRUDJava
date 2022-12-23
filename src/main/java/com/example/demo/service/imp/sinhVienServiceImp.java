//package com.example.demo.service.imp;
//
//import com.example.demo.mapper.sinhVienMapper;
//import com.example.demo.model.bo.responPage;
//import com.example.demo.model.dto.sinhVienDto;
//import com.example.demo.model.entity.sinhVienEnity;
//import com.example.demo.responsitory.sinhVienResponsitory;
//import com.example.demo.service.sinhVienService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//
//public class sinhVienServiceImp implements sinhVienService {
//
//    @Autowired
//    private sinhVienResponsitory sinhVienResponsitory;
//
//    @Override
//    public responPage getAll() {
//        List<sinhVienEnity>list = sinhVienResponsitory.findAll();
//        List<sinhVienDto> listDto = list.stream().map(sinhVienMapper::map).collect(Collectors.toList());
//        return new responPage("listDto",listDto);
//    }
//}


package com.example.demo.service.imp;

import com.example.demo.mapper.sinhVienMapper;
import com.example.demo.model.bo.respon;
import com.example.demo.model.bo.responPage;
import com.example.demo.model.dto.sinhVienDto;
import com.example.demo.model.entity.giaoVienEntity;
import com.example.demo.model.entity.sinhVienEnity;
import com.example.demo.model.in.sinhVienIn;
import com.example.demo.responsitory.giaoVienResponsitory;
import com.example.demo.responsitory.sinhVienResponsitory;
import com.example.demo.service.sinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class sinhVienServiceImp implements sinhVienService {
    @Autowired
    private sinhVienResponsitory sinhVienResponsitory;

    @Autowired
    private giaoVienResponsitory giaoVienResponsitory;
    @Override
    public responPage getAll() {
        List<sinhVienEnity> list = sinhVienResponsitory.findAll();
        List<sinhVienDto> listDto = list.stream().map(sinhVienMapper::map).collect(Collectors.toList());
        return new responPage("success teacher", listDto);
    }

    @Override
    public respon create(sinhVienIn sinhVienIn) {
        sinhVienEnity sinhVienEnity = sinhVienMapper.map(sinhVienIn);
        giaoVienEntity giaoVienEntity = giaoVienResponsitory.getById(sinhVienIn.getIdGV());
        sinhVienEnity.setGiaoVienEntity(giaoVienEntity);
        sinhVienResponsitory.save(sinhVienEnity);
        return new respon(true, "add success Student");
    }

    @Override
    public respon delete(Integer IdSV) {
        sinhVienEnity sinhVienEnity = sinhVienResponsitory.getById(IdSV);
        sinhVienResponsitory.delete(sinhVienEnity);
        return new respon(true, "del success Student");
    }

    @Override
    public respon update(Integer IdSV, sinhVienIn sinhVienIn) {
        sinhVienEnity sinhVienEnity = sinhVienResponsitory.getById(IdSV);
        giaoVienEntity giaoVienEntity = giaoVienResponsitory.getById(sinhVienIn.getIdGV());
        sinhVienEnity.setGiaoVienEntity(giaoVienEntity);
        sinhVienEnity.setNameSV(sinhVienIn.getNameSV());
        sinhVienEnity.setAddress(sinhVienIn.getAddress());
        sinhVienResponsitory.save(sinhVienEnity);
        return new respon(true, "update success Student");
    }
}
