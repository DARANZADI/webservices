package eus.ehu.informatica.service;

import java.util.List;

import eus.ehu.informatica.beans.Libro;
import eus.ehu.informatica.dao.LibroDAO;
import eus.ehu.informatica.service.interfaces.ILibroService;

public class LibroService implements ILibroService{
	private LibroDAO libroDao;

	public LibroService() {
		super();
		libroDao = new LibroDAO();
	}

	public LibroDAO getLibroDao() {
		return libroDao;
	}

	public void setLibroDao(LibroDAO libroDao) {
		this.libroDao = libroDao;
	}

	@Override
	public Libro getById(String isbn) {
		Libro libro = null;
		libro  = libroDao.getById(isbn);
		return libro;
	}

	@Override
	public int create(Libro libro) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void generateXML() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Libro> getAll() {
		List<Libro>libros = null;
		libros = libroDao.getAll();
		return libros;
	}
	
	
}
