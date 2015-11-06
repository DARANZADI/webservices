/*
 * An XML document type.
 * Localname: getServiceVersion
 * Namespace: http://service.formacion.ipartek.com
 * Java type: com.ipartek.formacion.service.GetServiceVersionDocument
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.service.impl;
/**
 * A document containing one getServiceVersion(@http://service.formacion.ipartek.com) element.
 *
 * This is a complex type.
 */
public class GetServiceVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.service.GetServiceVersionDocument
{
    
    public GetServiceVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSERVICEVERSION$0 = 
        new javax.xml.namespace.QName("http://service.formacion.ipartek.com", "getServiceVersion");
    
    
    /**
     * Gets the "getServiceVersion" element
     */
    public com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion getGetServiceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion target = null;
            target = (com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion)get_store().find_element_user(GETSERVICEVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getServiceVersion" element
     */
    public void setGetServiceVersion(com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion getServiceVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion target = null;
            target = (com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion)get_store().find_element_user(GETSERVICEVERSION$0, 0);
            if (target == null)
            {
                target = (com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion)get_store().add_element_user(GETSERVICEVERSION$0);
            }
            target.set(getServiceVersion);
        }
    }
    
    /**
     * Appends and returns a new empty "getServiceVersion" element
     */
    public com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion addNewGetServiceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion target = null;
            target = (com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion)get_store().add_element_user(GETSERVICEVERSION$0);
            return target;
        }
    }
    /**
     * An XML getServiceVersion(@http://service.formacion.ipartek.com).
     *
     * This is a complex type.
     */
    public static class GetServiceVersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.service.GetServiceVersionDocument.GetServiceVersion
    {
        
        public GetServiceVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
