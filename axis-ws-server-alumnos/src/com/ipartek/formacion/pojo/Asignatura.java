package com.ipartek.formacion.pojo;

public class Asignatura {
  private String codigo;
  private String nombre;

  public Asignatura() {
    super();
    setCodigo("");
    setNombre("");
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

}
