package eus.ehu.informatica.service.interfaces;

import java.util.List;

import eus.ehu.informatica.beans.Libro;

public interface ILibroService {
	public Libro getById(String isbn);
	
	public int create(Libro libro);
	
	public void generateXML();
	
	public List<Libro>getAll();
}
