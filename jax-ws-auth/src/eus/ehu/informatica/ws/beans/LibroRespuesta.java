package eus.ehu.informatica.ws.beans;

import eus.ehu.informatica.beans.Libro;

public class LibroRespuesta extends Libro{

	private String mensaje;
	public LibroRespuesta(Libro libro) {
		super();
		if(libro!=null){
			super.setIsbn(libro.getIsbn());
			super.setTitulo(libro.getTitulo());
		}else{
			setMensaje("El libro no existe");
		}
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
}
