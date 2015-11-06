package com.ipartek.formacion.pojo;

import java.util.ArrayList;
import java.util.List;

public class CandidatoArray {
  private List<Candidato> candidatos;

  public CandidatoArray() {
    candidatos = new ArrayList<Candidato>();
  }

  public List<Candidato> getCandidatos() {
    return candidatos;
  }

  public void setCandidatos(List<Candidato> candidatos) {
    this.candidatos = candidatos;
  }

}
