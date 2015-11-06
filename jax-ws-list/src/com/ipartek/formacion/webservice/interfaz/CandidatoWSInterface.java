package com.ipartek.formacion.webservice.interfaz;

import com.ipartek.formacion.pojo.Candidato;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CandidatoWSInterface {
  @WebMethod
  public Candidato[] getAll();

  @WebMethod
  public Candidato getById(int id);

  @WebMethod
  public int create(Candidato candidato);

  @WebMethod
  public int delete(int codCandidato);

  @WebMethod
  public int update(Candidato candidato);

}
