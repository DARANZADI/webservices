package eus.ehu.informatica.ws.beans;

import java.util.List;

import eus.ehu.informatica.beans.Libro;

public class LibroArray {
	private List<Libro> libros;
	private String mensaje;
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensage) {
		this.mensaje = mensage;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		if(libros!=null){
			this.libros = libros;
		}else{
			setMensaje("No se ha obtenido la lista de libros");
		}
	}

	public LibroArray() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
