package com.ipartek.formacion.service;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;

public class EjemploService {
  public OMElement sayHello(OMElement element) throws XMLStreamException {
    element.build();
    element.detach();

    String rootName = element.getLocalName();
    System.out.println("Leyendo " + rootName + " elemento");

    OMElement childElement = element.getFirstElement();
    String personToGreet = childElement.getText();

    OMFactory fac = OMAbstractFactory.getOMFactory();
    OMNamespace omNs = fac.createOMNamespace("http://example1.org/example1", "example1");
    OMElement method = fac.createOMElement("sayHelloResponse", omNs);
    OMElement value = fac.createOMElement("greeting", omNs);
    value.addChild(fac.createOMText(value, "Hola, " + personToGreet));
    method.addChild(value);

    return method;
  }

  @SuppressWarnings("unused")
  private void ping() {
  }
}
