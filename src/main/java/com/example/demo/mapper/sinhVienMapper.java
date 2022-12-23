package com.example.demo.mapper;

import com.example.demo.model.dto.sinhVienDto;
import com.example.demo.model.entity.sinhVienEnity;
import com.example.demo.model.in.sinhVienIn;

public class sinhVienMapper {

    public static sinhVienEnity map(sinhVienIn sinhVienIn){
        sinhVienEnity sinhVienEnity = new sinhVienEnity();
        sinhVienEnity.setIdSV(sinhVienIn.getIdSV());
        sinhVienEnity.setNameSV(sinhVienIn.getNameSV());
        sinhVienEnity.setAddress(sinhVienIn.getAddress());
        return  sinhVienEnity;
    }


    public static sinhVienDto map(sinhVienEnity sinhVienEnity){
        sinhVienDto sinhVienDto = new sinhVienDto();
        sinhVienDto.setIdSV(sinhVienEnity.getIdSV());
        sinhVienDto.setNameSV(sinhVienEnity.getNameSV());
        sinhVienDto.setAddress(sinhVienEnity.getAddress());
        if(sinhVienEnity.getGiaoVienEntity() == null){
            sinhVienDto.setNameGV(null);
            sinhVienDto.setIdGV(null);
        }else {
            sinhVienDto.setNameGV(sinhVienEnity.getGiaoVienEntity().getNameGV());
            sinhVienDto.setIdGV(sinhVienEnity.getGiaoVienEntity().getIdGV());
        }
        return  sinhVienDto;
    }
}
