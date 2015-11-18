package com.ipartek.formacion.ws;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class PWCBHandler implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {

		for (int i = 0; i < callbacks.length; i++) {
        //Autenticación del usuario y contraseña
        WSPasswordCallback pwcb = (WSPasswordCallback)callbacks[i];
        //comprobaciones de usuario y contraseña para acceso al servicio
	        if(pwcb.getIdentifier().equals("urko") && pwcb.getPassword().equals("pass")) {
	            //autenticación con éxito
	            return;
	        } else {
	            throw new UnsupportedCallbackException(callbacks[i], "fallo de autenticación");
	        }
		}
	}	
}
