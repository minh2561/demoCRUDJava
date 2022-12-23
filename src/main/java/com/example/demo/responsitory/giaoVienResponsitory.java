package com.example.demo.responsitory;

import com.example.demo.model.entity.giaoVienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface giaoVienResponsitory extends JpaRepository<giaoVienEntity,Integer> {
    giaoVienEntity getById(Integer Id);
}
