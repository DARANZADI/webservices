package com.ipartek.formacion.service;

import com.ipartek.formacion.dao.AlumnoDAOImpl;
import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.service.interfaces.AlumnoServiceSoap;

public class AlumnoServiceSoapImp implements AlumnoServiceSoap {
  @Override
  public Alumno getAlumnoByDni(String dni) {

    Alumno al = null;
    AlumnoDAOImpl aldao = new AlumnoDAOImpl();
    al = aldao.getByDni(dni);
    return al;
  }

  @Override
  public String getServiceVersion() {
    return "This is initial version 1.0";
  }

}
