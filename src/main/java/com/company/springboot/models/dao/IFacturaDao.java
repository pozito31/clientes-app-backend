package com.company.springboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.springboot.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
