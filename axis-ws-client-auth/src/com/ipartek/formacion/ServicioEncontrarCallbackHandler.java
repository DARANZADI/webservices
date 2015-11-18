/**
 * ServicioEncontrarCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ipartek.formacion;


/**
 *  ServicioEncontrarCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ServicioEncontrarCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ServicioEncontrarCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ServicioEncontrarCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for saludar method
     * override this method for handling normal response from saludar operation
     */
    public void receiveResultsaludar(
        com.ipartek.formacion.ws.SaludarResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from saludar operation
     */
    public void receiveErrorsaludar(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for despedir method
     * override this method for handling normal response from despedir operation
     */
    public void receiveResultdespedir(
        com.ipartek.formacion.ws.DespedirResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from despedir operation
     */
    public void receiveErrordespedir(java.lang.Exception e) {
    }
}
