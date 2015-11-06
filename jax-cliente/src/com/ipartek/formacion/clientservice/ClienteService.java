package com.ipartek.formacion.clientservice;

import com.ipartek.formacion.webservice.WebServiceImplService;
import com.ipartek.formacion.webservice.WebServiceInterface;

public class ClienteService {

  public static void main(String[] args) {
    WebServiceImplService webService = new WebServiceImplService();
    WebServiceInterface serviceInterface = webService.getWebServiceImplPort();
    System.out.println(serviceInterface.printMessage());
  }

}
