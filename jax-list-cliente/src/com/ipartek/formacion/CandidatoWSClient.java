package com.ipartek.formacion;

import com.ipartek.formacion.webservice.CandidatoWSImplService;
import com.ipartek.formacion.webservice.CandidatoWSInterface;
import com.ipartek.formacion.webservice.interfaz.Candidato;
import com.ipartek.formacion.webservice.interfaz.CandidatoArray;

import java.util.List;

public class CandidatoWSClient {

  public static void main(String[] args) {
    CandidatoWSImplService webService = new CandidatoWSImplService();
    CandidatoWSInterface webInterface = webService.getCandidatoWSImplPort();

    CandidatoArray candidatoArray = webInterface.getAll();
    List<Candidato> candidatos = candidatoArray.getItem();

    for (Candidato c : candidatos) {
      System.out.println(c.getNombre());
    }
  }
}
