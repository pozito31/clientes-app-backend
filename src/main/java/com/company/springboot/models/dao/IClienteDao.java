package com.company.springboot.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.springboot.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
