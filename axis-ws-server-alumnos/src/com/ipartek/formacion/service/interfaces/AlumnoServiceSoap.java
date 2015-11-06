package com.ipartek.formacion.service.interfaces;

import com.ipartek.formacion.pojo.Alumno;

public interface AlumnoServiceSoap {

  public Alumno getAlumnoByDni(String dni);

  public String getServiceVersion();
}
