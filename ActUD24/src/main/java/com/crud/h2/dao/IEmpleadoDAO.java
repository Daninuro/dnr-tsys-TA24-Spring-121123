package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Empleado;


public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{

}
