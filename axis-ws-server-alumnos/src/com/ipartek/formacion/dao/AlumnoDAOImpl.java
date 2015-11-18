package com.ipartek.formacion.dao;



import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.dao.interfaces.AlumnoDAO;
import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.pojo.Alumno.AlumAsignatura;
import com.ipartek.formacion.pojo.Asignatura;

public class AlumnoDAOImpl implements AlumnoDAO {

  private List<Alumno> alumnos;

  public AlumnoDAOImpl() {
    init();
  }

  private void init() {
    alumnos = new ArrayList<Alumno>();
    Alumno al = new Alumno();
    AlumAsignatura alasig = null;
    List<Asignatura> asignaturas = new AsignaturaDAOImpl().getAll();
    List<AlumAsignatura> asigmatriculado = null;
    Asignatura asig = null;

    al.setNombre("Urko");
    al.setDni("30693185z");
    al.setApellido1("Villanueva");

    asigmatriculado = new ArrayList<Alumno.AlumAsignatura>();
    for (int i = 0; i < asignaturas.size(); i++) {
      asig = asignaturas.get(i);
      alasig = al.new AlumAsignatura(asig);
      alasig.setNota(10.0);
      asigmatriculado.add(alasig);
    }
    al.setAsignaturas(asigmatriculado);
    alumnos.add(al);
  }

  @Override
  public List<Alumno> getAll() {

    return alumnos;
  }

  @Override
  public Alumno getByDni(String dni) {
    Alumno alumno = null;
    int i = 0;
    int lon = alumnos.size();
    boolean encontrado = false;

    while (i < lon && encontrado == false) {
      if (alumnos.get(i).getDni().equalsIgnoreCase(dni)) {
        alumno = alumnos.get(i);
        encontrado = true;
      }

      i++;
    }

    return alumno;
  }

}
