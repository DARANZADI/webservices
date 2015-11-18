package eus.ehu.informatica.dao;

import java.util.ArrayList;
import java.util.List;

import eus.ehu.informatica.beans.Libro;
import eus.ehu.informatica.dao.intefaces.ILibroDAO;

public class LibroDAO implements ILibroDAO{
	List<Libro> libros; 
	public LibroDAO() {
		super();
		init();
	}

	private void init() {
		Libro libro = new Libro();
		
		libro.setIsbn("aaaa");
		libro.setTitulo("Java for dummies");
		libros = new ArrayList<Libro>();
		libros.add(libro);
		
	}

	@Override
	public Libro getById(String isbn) {
		Libro libro = null;
		int i = 0;
		boolean encontrado = false;
		int lon = libros.size();
		while(i<lon&&encontrado==false){
			if(libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
				encontrado= true;
				libro = libros.get(i);
			}
			i++;
		}
		return libro;
	}

	@Override
	public int create(Libro libro) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Libro> getAll() {
		// TODO Auto-generated method stub
		return libros;
	}

}
