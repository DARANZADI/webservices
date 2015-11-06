package com.ipartek.formacion.dao.interfaces;

import com.ipartek.formacion.pojo.Asignatura;

import java.util.List;

public interface AsignaturaDAO {
  public Asignatura getById(String codigo);

  public List<Asignatura> getAll();
}
