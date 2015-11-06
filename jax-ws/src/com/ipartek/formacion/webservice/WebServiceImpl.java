package com.ipartek.formacion.webservice;

import com.ipartek.formacion.webservice.interfaz.WebServiceInterface;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ipartek.formacion.webservice.interfaz.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface {

  @Override
  public String printMessage() {
    return "Hello World";
  }

}
