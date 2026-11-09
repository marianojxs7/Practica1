package com.practica.practica01.repository;

import com.practica.practica01.domain.Suculenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuculentaRepository extends JpaRepository<Suculenta, Integer> {

}