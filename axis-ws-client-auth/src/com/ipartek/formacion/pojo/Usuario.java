package com.ipartek.formacion.pojo;

public class Usuario {

	private String nombre;
	private String pass;
	
	public Usuario(){
		setNombre("");
		setPass("");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
