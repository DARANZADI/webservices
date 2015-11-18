package eus.ehu.informatica.ws.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlElement;

import eus.ehu.informatica.beans.Libro;
import eus.ehu.informatica.ws.beans.LibroArray;
import eus.ehu.informatica.ws.beans.LibroRespuesta;

@WebService
@SOAPBinding(style=Style.RPC)
public interface ILibroWS {

	@WebMethod(operationName="obtenerPorISBN")
	@WebResult(name="libro")
	public LibroRespuesta getById(@WebParam(name="isbn") 
	@XmlElement(required=true,nillable=false)String isbn);
	
	
	@WebMethod(operationName="obtenerListadoLibros")
	@WebResult(name="listaLibros")
	public LibroArray getAllArray();
	
	
	
}
