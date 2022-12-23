package com.example.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="giaoVien")
public class giaoVienEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdGV;

    @Column
    private  String     nameGV;

    @OneToMany(mappedBy = "giaoVienEntity",cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Collection<sinhVienEnity> sinhVienEnity;

    @PreRemove
    private void preRemove(){sinhVienEnity.forEach(sinhVienEnity ->sinhVienEnity.setGiaoVienEntity(null));}
}
