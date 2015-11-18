package eus.ehu.informatica.dao.intefaces;

import java.util.List;

import eus.ehu.informatica.beans.Libro;

public interface ILibroDAO {

	public Libro getById(String isbn);
	
	public int create(Libro libro);
	
	public List<Libro>getAll();
}
