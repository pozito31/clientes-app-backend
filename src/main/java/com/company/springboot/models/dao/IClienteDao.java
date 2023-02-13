package com.company.springboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.springboot.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
