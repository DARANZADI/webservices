package com.ipartek.formacion.dao;

import com.ipartek.formacion.dao.interfaces.AsignaturaDAO;
import com.ipartek.formacion.pojo.Asignatura;

import java.util.ArrayList;
import java.util.List;

public class AsignaturaDAOImpl implements AsignaturaDAO {
  private List<Asignatura> asignaturas;

  public AsignaturaDAOImpl() {
    init();
  }

  private void init() {
    Asignatura asignatura = null;
    asignaturas = new ArrayList<Asignatura>();

    asignatura = new Asignatura();
    asignatura.setCodigo("AGR3538");
    asignatura.setNombre("Algebra I");
    asignaturas.add(asignatura);

    asignatura = new Asignatura();
    asignatura.setCodigo("HIST5080");
    asignatura.setNombre("Historia del País Vasco I");
    asignaturas.add(asignatura);
  }

  @Override
  public Asignatura getById(String codigo) {
    Asignatura asignatura = null;
    boolean encontrado = false;
    int i = 0;
    int lon = asignaturas.size();

    while (i < lon && encontrado == false) {
      if (asignaturas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
        encontrado = true;
        asignatura = asignaturas.get(i);
      }
      i++;
    }

    return asignatura;
  }

  @Override
  public List<Asignatura> getAll() {

    return asignaturas;
  }

}
