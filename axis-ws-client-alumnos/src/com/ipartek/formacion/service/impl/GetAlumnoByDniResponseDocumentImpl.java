/*
 * An XML document type.
 * Localname: getAlumnoByDniResponse
 * Namespace: http://service.formacion.ipartek.com
 * Java type: com.ipartek.formacion.service.GetAlumnoByDniResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.service.impl;
/**
 * A document containing one getAlumnoByDniResponse(@http://service.formacion.ipartek.com) element.
 *
 * This is a complex type.
 */
public class GetAlumnoByDniResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.service.GetAlumnoByDniResponseDocument
{
    
    public GetAlumnoByDniResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALUMNOBYDNIRESPONSE$0 = 
        new javax.xml.namespace.QName("http://service.formacion.ipartek.com", "getAlumnoByDniResponse");
    
    
    /**
     * Gets the "getAlumnoByDniResponse" element
     */
    public com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse getGetAlumnoByDniResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse target = null;
            target = (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse)get_store().find_element_user(GETALUMNOBYDNIRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAlumnoByDniResponse" element
     */
    public void setGetAlumnoByDniResponse(com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse getAlumnoByDniResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse target = null;
            target = (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse)get_store().find_element_user(GETALUMNOBYDNIRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse)get_store().add_element_user(GETALUMNOBYDNIRESPONSE$0);
            }
            target.set(getAlumnoByDniResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAlumnoByDniResponse" element
     */
    public com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse addNewGetAlumnoByDniResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse target = null;
            target = (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse)get_store().add_element_user(GETALUMNOBYDNIRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getAlumnoByDniResponse(@http://service.formacion.ipartek.com).
     *
     * This is a complex type.
     */
    public static class GetAlumnoByDniResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse
    {
        
        public GetAlumnoByDniResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://service.formacion.ipartek.com", "return");
        
        
        /**
         * Gets the "return" element
         */
        public com.ipartek.formacion.pojo.xsd.Alumno getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.ipartek.formacion.pojo.xsd.Alumno target = null;
                target = (com.ipartek.formacion.pojo.xsd.Alumno)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
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
                com.ipartek.formacion.pojo.xsd.Alumno target = null;
                target = (com.ipartek.formacion.pojo.xsd.Alumno)get_store().find_element_user(RETURN$0, 0);
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
        public void setReturn(com.ipartek.formacion.pojo.xsd.Alumno xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.ipartek.formacion.pojo.xsd.Alumno target = null;
                target = (com.ipartek.formacion.pojo.xsd.Alumno)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (com.ipartek.formacion.pojo.xsd.Alumno)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public com.ipartek.formacion.pojo.xsd.Alumno addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.ipartek.formacion.pojo.xsd.Alumno target = null;
                target = (com.ipartek.formacion.pojo.xsd.Alumno)get_store().add_element_user(RETURN$0);
                return target;
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
                com.ipartek.formacion.pojo.xsd.Alumno target = null;
                target = (com.ipartek.formacion.pojo.xsd.Alumno)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (com.ipartek.formacion.pojo.xsd.Alumno)get_store().add_element_user(RETURN$0);
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
