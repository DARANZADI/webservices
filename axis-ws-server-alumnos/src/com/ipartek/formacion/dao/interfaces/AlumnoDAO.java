package com.ipartek.formacion.dao.interfaces;

import com.ipartek.formacion.pojo.Alumno;

import java.util.List;

public interface AlumnoDAO {
  public List<Alumno> getAll();

  public Alumno getByDni(String dni);

}
