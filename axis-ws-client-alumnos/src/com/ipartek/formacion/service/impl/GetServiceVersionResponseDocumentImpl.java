/*
 * An XML document type.
 * Localname: getServiceVersionResponse
 * Namespace: http://service.formacion.ipartek.com
 * Java type: com.ipartek.formacion.service.GetServiceVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.service.impl;
/**
 * A document containing one getServiceVersionResponse(@http://service.formacion.ipartek.com) element.
 *
 * This is a complex type.
 */
public class GetServiceVersionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.service.GetServiceVersionResponseDocument
{
    
    public GetServiceVersionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSERVICEVERSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://service.formacion.ipartek.com", "getServiceVersionResponse");
    
    
    /**
     * Gets the "getServiceVersionResponse" element
     */
    public com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse getGetServiceVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse target = null;
            target = (com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse)get_store().find_element_user(GETSERVICEVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getServiceVersionResponse" element
     */
    public void setGetServiceVersionResponse(com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse getServiceVersionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse target = null;
            target = (com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse)get_store().find_element_user(GETSERVICEVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse)get_store().add_element_user(GETSERVICEVERSIONRESPONSE$0);
            }
            target.set(getServiceVersionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getServiceVersionResponse" element
     */
    public com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse addNewGetServiceVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse target = null;
            target = (com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse)get_store().add_element_user(GETSERVICEVERSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getServiceVersionResponse(@http://service.formacion.ipartek.com).
     *
     * This is a complex type.
     */
    public static class GetServiceVersionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.service.GetServiceVersionResponseDocument.GetServiceVersionResponse
    {
        
        public GetServiceVersionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://service.formacion.ipartek.com", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
