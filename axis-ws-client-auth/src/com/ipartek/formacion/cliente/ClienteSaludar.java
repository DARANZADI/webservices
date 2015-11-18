package com.ipartek.formacion.cliente;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;



import javax.xml.stream.XMLStreamException;




import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;
import org.apache.rampart.RampartMessageData;

import com.ipartek.formacion.ServicioEncontrarStub;
import com.ipartek.formacion.pojo.Usuario;
import com.ipartek.formacion.ws.DespedirDocument;
import com.ipartek.formacion.ws.DespedirResponseDocument;
import com.ipartek.formacion.ws.SaludarDocument;
import com.ipartek.formacion.ws.SaludarResponseDocument;


public class ClienteSaludar {
//wsdl2java -uri [ruta wsdl] -p [paquete donde se despliega] -d adb -s -ss -sd -ssi -o build\service
	static Usuario usuario;
	public static void main(String[] args) {
		usuario = new Usuario();
		usuario.setNombre("urko");
		usuario.setPass("pass");
		ClienteSaludar cs = new ClienteSaludar();
		
		try {
			System.out.println(cs.callServiceSaludar("Urko"));
			System.out.println(cs.callServiceDespedir("Urko"));
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	public String callServiceDespedir(String name) throws AxisFault,RemoteException, FileNotFoundException, XMLStreamException{
		/*
		 * Utilizamos el stub generado a partir del wsdl que logran establecer
		 * la conexion con el web service proveedor.
		 */

			ServicioEncontrarStub stub =getStub();

			DespedirDocument request = DespedirDocument.Factory.newInstance();
			DespedirDocument.Despedir dataReq = request.addNewDespedir();
	
			dataReq.setArgs0(name);
			
			DespedirResponseDocument response = stub.despedir(request);
			DespedirResponseDocument.DespedirResponse dataResp = response.getDespedirResponse();
			
			String resultado = dataResp.getReturn();
			
			return resultado;

	}
	public String callServiceSaludar(String name) throws AxisFault,RemoteException, FileNotFoundException, XMLStreamException  {
		/*
		 * Utilizamos el stub generado a partir del wsdl que logran establecer
		 * la conexion con el web service proveedor.
		 */
	
		ServicioEncontrarStub stub =getStub();

		SaludarDocument request = SaludarDocument.Factory.newInstance();
		SaludarDocument.Saludar dataReq = request.addNewSaludar();

		dataReq.setArgs0(name);
	
		SaludarResponseDocument response = stub.saludar(request);
		SaludarResponseDocument.SaludarResponse dataResp = response.getSaludarResponse();
		
		String resultado = dataResp.getReturn();
		
		return resultado;
		


	}
	
	private static ServicioEncontrarStub getStub() throws AxisFault, FileNotFoundException, XMLStreamException {
		ConfigurationContext ctx;
		//el directorio que le pasamos a la configuración debe contener un directorio
		//con nombre "modules" donde estarán los módulos de rampart "rampart" y "rahas"
		ctx = ConfigurationContextFactory
				.createConfigurationContextFromFileSystem("C:\\desarrollo\\axis2-1.6.3\\repository" , null);

		//indicamos la URL de punto de entrada a nuestro servicio
		ServicioEncontrarStub stub = new ServicioEncontrarStub(
				ctx,
				"http://localhost:8080/axis2/services/ServicioEncontrar");
		String rutaPolicy="";
		
		
		ServiceClient sc = stub._getServiceClient();
		//vinculamos el módulo de rampart
		sc.engageModule("rampart");
		Options options = sc.getOptions();
		//indicamos usuario y contraseña
		options.setUserName(usuario.getNombre());
		options.setPassword(usuario.getPass());
		//vinculamos al archivo policy.xml
		options.setProperty(RampartMessageData.KEY_RAMPART_POLICY, cargarPolicy(rutaPolicy));
		return stub;

	}
	private static Policy cargarPolicy(String rutaPolicy) throws FileNotFoundException, XMLStreamException {
		StAXOMBuilder builder = new StAXOMBuilder(rutaPolicy);
		OMElement elem = builder.getDocumentElement();
		return PolicyEngine.getPolicy(builder.getDocumentElement());
	}
	
}
