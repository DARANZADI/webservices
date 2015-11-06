package com.ipartek.formacion.pojo;

import java.util.List;

public class Alumno {
  private int codigo;
  private String dni;
  private String nombre;
  private String apellido1;
  private String apellido2;
  private List<AlumAsignatura> asignaturas;

  public Alumno() {
    super();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido1() {
    return apellido1;
  }

  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public String getApellido2() {
    return apellido2;
  }

  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  public List<AlumAsignatura> getAsignaturas() {
    return asignaturas;
  }

  public void setAsignaturas(List<AlumAsignatura> asignaturas) {
    this.asignaturas = asignaturas;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public class AlumAsignatura {
    private Asignatura asignatura;
    private double nota;

    public AlumAsignatura(Asignatura asignatura) {
      super();
      this.asignatura = asignatura;
      setNota(0.0);
    }

    public Asignatura getAsignatura() {
      return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
      this.asignatura = asignatura;
    }

    public double getNota() {
      return nota;
    }

    public void setNota(double nota) {
      this.nota = nota;
    }

  }

}
