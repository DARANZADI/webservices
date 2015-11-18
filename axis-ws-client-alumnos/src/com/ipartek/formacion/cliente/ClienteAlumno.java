package com.ipartek.formacion.cliente;

import alumnos.AlumnosServicioStub;

import com.ipartek.formacion.pojo.xsd.Alumno;
import com.ipartek.formacion.service.GetAlumnoByDniDocument;
import com.ipartek.formacion.service.GetAlumnoByDniResponseDocument;
import com.ipartek.formacion.service.GetServiceVersionDocument;

public class ClienteAlumno {

  public static void main(String[] args) {
    Alumno al = null;
    try {
      AlumnosServicioStub stub = new AlumnosServicioStub(
          "http://localhost:8080/axis2/services/AlumnosServicio");

      //GetServiceVersionDocument reqDocument;
      
      //reqDocument = GetServiceVersionDocument.Factory.newInstance();
      GetAlumnoByDniDocument request = GetAlumnoByDniDocument.Factory.newInstance();
      GetAlumnoByDniDocument.GetAlumnoByDni dataReq = request.addNewGetAlumnoByDni();
      dataReq.setArgs0("30693185z");

      
      
      
      
      GetAlumnoByDniResponseDocument response = stub.getAlumnoByDni(request);

      GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse dataRes = response
          .getGetAlumnoByDniResponse();
      
      
      
      
      
      
      
      al = dataRes.getReturn();

      System.out.println(al.getNombre());

    } catch (Exception e) {
      System.out.println(e.toString());
    }

  }

}
