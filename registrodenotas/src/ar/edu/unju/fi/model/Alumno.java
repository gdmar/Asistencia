package ar.edu.unju.fi.model;

public class Alumno {
	
	private String apellido;
	private String nombre;
	private String legajo;
	
	
	
	@Override
	public String toString() {
		return " apellido=" + apellido + ", nombre=" + nombre + ", legajo=" + legajo + " ";
	}
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	

}
