package com.example.demo.model.entity;

import lombok.*;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="sinhVien")
public class sinhVienEnity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdSV;

    @Column
    private String nameSV;

    @Column
    private String address;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="Id_GV")
    private  giaoVienEntity giaoVienEntity;

}


