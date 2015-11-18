package com.ipartek.formacion.ws;


import com.ipartek.formacion.ws.interfaces.ServicioEncontrar;

public class ServicioEncontrarImpl implements ServicioEncontrar {

	@Override
	public String despedir(String nombre) {
		
		return "Agur "+nombre;
	}

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Hola"+ nombre;
	}

}
