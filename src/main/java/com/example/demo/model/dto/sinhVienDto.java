package com.example.demo.model.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class sinhVienDto {
    private Integer IdSV;
    private String nameSV;
    private String address;
    private String nameGV;
    private Integer idGV;
}
