package com.felipe.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
