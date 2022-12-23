package com.example.demo.responsitory;

import com.example.demo.model.entity.sinhVienEnity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sinhVienResponsitory extends JpaRepository<sinhVienEnity, Integer> {
    sinhVienEnity getById(Integer Id);
}
