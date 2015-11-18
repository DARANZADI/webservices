package eus.ehu.informatica;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import eus.ehu.informatica.ws.ILibroWS;
import eus.ehu.informatica.ws.LibroWSImpService;
import eus.ehu.informatica.ws.interfaces.Libro;
import eus.ehu.informatica.ws.interfaces.LibroArray;

public class ClienteService {

	public static void main(String[] args) throws MalformedURLException {
		
		String wsdlurlip = "http://localhost:8080/jax-ws-auth/libroservice?wsdl";
		URL url = new URL(wsdlurlip);
		/*
		
		QName qname = new QName("http://ws.informatica.ehu.eus/", "LibroWSImpService");
		Service service = null;
		service = Service.create(url,qname);
		
		
		*/
		LibroWSImpService ws = new LibroWSImpService(url);
		ILibroWS serviceInterface = ws.getLibroWSImpPort();
		Map<String,Object> requestContext = ((BindingProvider)serviceInterface).getRequestContext();
		requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlurlip);
		
		Map<String,List<String>> requestHeaders = new HashMap<String, List<String>>();
		
		requestHeaders.put("sessionId", Collections.singletonList("ipda"));
		
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, 
				requestHeaders);
		
		LibroArray libroArray = serviceInterface.obtenerListadoLibros();
		List<Libro> libros = libroArray.getLibros();
		for(Libro libro: libros){
			System.out.println(libro.getTitulo());
		}

	}

}
