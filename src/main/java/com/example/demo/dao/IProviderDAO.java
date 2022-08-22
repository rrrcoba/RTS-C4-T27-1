package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Provider;

public interface IProviderDAO extends JpaRepository<Provider, Long>{

}
