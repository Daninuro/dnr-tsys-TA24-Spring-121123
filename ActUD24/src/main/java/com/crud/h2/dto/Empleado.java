package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;




@Entity
@Table(name="trabajadores")//en caso que la tabla sea diferente
public class Empleado  {
 
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellido")//no hace falta si se llama igual
	private String apellido;
	@Column(name = "salario")//no hace falta si se llama igual
	private double salario;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private String trabajo;

	
	//Constructores
	
	public Empleado() {
	
	}

	public Empleado(Long id, String nombre, String apellido, double salario, String trabajo) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.trabajo = trabajo;

	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	@PrePersist
	public void calcularSalario() {
	    // Lógica para establecer salarios personalizados según la profesión
	    if ("programador".equals(trabajo)) {
	        salario = 60000.0; // Salario para programadores
	    } else if ("electricista".equals(trabajo)) {
	        salario = 50000.0; // Salario para electricistas
	    } else if ("profesor".equals(trabajo)) {
	        salario = 45000.0; // Salario para profesores
	    } else if ("diseñador".equals(trabajo)) {
	        salario = 55000.0; // Salario para diseñadores
	    }
	    // Puedes agregar más lógica según sea necesario
	}


	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario
				+ ", trabajo=" + trabajo + "]";
	}
	
	
	
	
	
}
