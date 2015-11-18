/*
 * An XML document type.
 * Localname: saludarResponse
 * Namespace: http://ws.formacion.ipartek.com
 * Java type: com.ipartek.formacion.ws.SaludarResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.ws.impl;
/**
 * A document containing one saludarResponse(@http://ws.formacion.ipartek.com) element.
 *
 * This is a complex type.
 */
public class SaludarResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.ws.SaludarResponseDocument
{
    
    public SaludarResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALUDARRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ws.formacion.ipartek.com", "saludarResponse");
    
    
    /**
     * Gets the "saludarResponse" element
     */
    public com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse getSaludarResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse target = null;
            target = (com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse)get_store().find_element_user(SALUDARRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "saludarResponse" element
     */
    public void setSaludarResponse(com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse saludarResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse target = null;
            target = (com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse)get_store().find_element_user(SALUDARRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse)get_store().add_element_user(SALUDARRESPONSE$0);
            }
            target.set(saludarResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "saludarResponse" element
     */
    public com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse addNewSaludarResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse target = null;
            target = (com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse)get_store().add_element_user(SALUDARRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML saludarResponse(@http://ws.formacion.ipartek.com).
     *
     * This is a complex type.
     */
    public static class SaludarResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.ws.SaludarResponseDocument.SaludarResponse
    {
        
        public SaludarResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://ws.formacion.ipartek.com", "return");
        
        
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
