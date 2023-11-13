package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadoDAO;
import com.crud.h2.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	//Utilizamos los metodos de la interface iEmpleadoDAO, es como si instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleado() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado EmpleadoXID(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
