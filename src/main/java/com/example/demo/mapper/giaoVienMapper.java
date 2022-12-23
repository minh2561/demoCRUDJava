package com.example.demo.mapper;

import com.example.demo.model.dto.giaoVienDto;
import com.example.demo.model.entity.giaoVienEntity;
import com.example.demo.model.in.giaoVienIn;

public class giaoVienMapper {
    public static giaoVienEntity mapIn(giaoVienIn giaoVienIn){
        giaoVienEntity giaoVienEntity = new giaoVienEntity();
        giaoVienEntity.setNameGV(giaoVienIn.getNameGV());
        giaoVienEntity.setIdGV(giaoVienIn.getIdGV());
        return giaoVienEntity;
    }

    public static giaoVienDto mapEntity (giaoVienEntity giaoVienEntity) {
        giaoVienDto giaoVienDto = new giaoVienDto();
        giaoVienDto.setIdGV(giaoVienEntity.getIdGV());
        giaoVienDto.setNameGV(giaoVienEntity.getNameGV());
        return giaoVienDto;

    }
}
