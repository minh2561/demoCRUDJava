package com.example.demo.service.imp;

import com.example.demo.mapper.giaoVienMapper;
import com.example.demo.model.bo.respon;
import com.example.demo.model.bo.responPage;
import com.example.demo.model.dto.giaoVienDto;
import com.example.demo.model.entity.giaoVienEntity;
import com.example.demo.model.in.giaoVienIn;
import com.example.demo.responsitory.giaoVienResponsitory;
import com.example.demo.service.giaoVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class giaoVienServiceImp implements giaoVienService {
    @Autowired
    private giaoVienResponsitory giaoVienResponsitory;

    @Override
    public responPage getAllGV(){
        List<giaoVienEntity> list = giaoVienResponsitory.findAll();
        List<giaoVienDto> listDto = list.stream().map(giaoVienMapper::mapEntity).collect(Collectors.toList());
        return new responPage("success GV",listDto);
    }

    @Override
    public respon createGV(giaoVienIn giaoVienIn){
        giaoVienEntity giaoVienEntity = giaoVienMapper.mapIn(giaoVienIn);
        giaoVienResponsitory.save(giaoVienEntity);
        return new respon(true,"add Success GV");
    }

    @Override
    public respon updateGV(Integer IdGV, giaoVienIn giaoVienIn){
        giaoVienEntity giaoVienEntity = giaoVienResponsitory.getById(IdGV);
        giaoVienEntity.setIdGV(IdGV);
        giaoVienEntity.setNameGV(giaoVienIn.getNameGV());
        giaoVienResponsitory.save(giaoVienEntity);
        return new respon(true,"update Success GV");
    }

    @Override
    public respon deleteGV(Integer IdGV){
        giaoVienEntity giaoVienEntity = giaoVienResponsitory.getById(IdGV);
        giaoVienResponsitory.delete(giaoVienEntity);
        return new respon(true,"delete Success GV");
    }
}
