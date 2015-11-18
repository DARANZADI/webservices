package eus.ehu.informatica.ws;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;


import javax.xml.ws.handler.MessageContext;

import eus.ehu.informatica.beans.Libro;
import eus.ehu.informatica.service.LibroService;
import eus.ehu.informatica.ws.beans.LibroArray;
import eus.ehu.informatica.ws.beans.LibroRespuesta;
import eus.ehu.informatica.ws.interfaces.ILibroWS;

@WebService(endpointInterface="eus.ehu.informatica.ws.interfaces.ILibroWS")
public class LibroWSImp implements ILibroWS{

	@Resource
	WebServiceContext wc;
	
	private LibroService ls;
	
	private boolean validarPeticion(){
		boolean valido = false;
		MessageContext contextoMensages=  wc.getMessageContext();
		Map<?,?> encabezados = (Map<?, ?>) contextoMensages.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<?> session = (List<?>) encabezados.get("sessionId");
		String sessionId = "ipdata";
		
		if(session!=null){
			//aqui hacer la peticion a la parte Service que devuelve el dato a validar
			if( sessionId.equals(session.get(0).toString())) {
				valido =true;
			}
		}
		return valido;
	}
	
	@Override
	public LibroRespuesta getById(String isbn) {
		ls = new LibroService();
		Libro libro = ls.getById(isbn);
		LibroRespuesta libroRespuesta = new LibroRespuesta(libro);

		
		return libroRespuesta;
	}


	@Override
	public LibroArray getAllArray() {
		
		LibroArray libroArray = new LibroArray();
		if(validarPeticion()==false){
			libroArray.setMensaje("Acceso no autorizado");
		}else{
			ls = new LibroService();
			libroArray.setLibros(ls.getAll());
		}
		return libroArray;
	}

}
