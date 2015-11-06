package com.ipartek.formacion.webservice;

import com.ipartek.formacion.pojo.Candidato;
import com.ipartek.formacion.webservice.interfaz.CandidatoWSInterface;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ipartek.formacion.webservice.interfaz.CandidatoWSInterface")
public class CandidatoWSImpl implements CandidatoWSInterface {
  private Candidato[] candidatosArray = new Candidato[2];

  // private List<Candidato> candidatos = null;

  private void init() {
    Candidato cand = null;

    cand = new Candidato();
    cand.setNombre("Urko");
    candidatosArray[0] = cand;

    cand = new Candidato();
    cand.setNombre("Ander");
    candidatosArray[1] = cand;
    // candidatosArray = (Candidato[]) candidatos.toArray();
  }

  @Override
  public Candidato[] getAll() {
    init();
    return candidatosArray;
  }

  @Override
  public Candidato getById(int id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int create(Candidato candidato) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int delete(int codCandidato) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int update(Candidato candidato) {
    // TODO Auto-generated method stub
    return 0;
  }

}
