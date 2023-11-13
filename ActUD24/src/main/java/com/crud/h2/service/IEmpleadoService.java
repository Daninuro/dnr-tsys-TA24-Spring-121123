package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Empleado;

public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleado(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado EmpleadoXID(Long id); //Leer datos de un empleado READ
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE
	
	
}
