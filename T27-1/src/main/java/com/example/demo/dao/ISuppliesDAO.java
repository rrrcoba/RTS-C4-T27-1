package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Supplies;

public interface ISuppliesDAO extends JpaRepository<Supplies, Long>{

}
