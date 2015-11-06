/*
 * An XML document type.
 * Localname: getAlumnoByDniResponse
 * Namespace: http://service.formacion.ipartek.com
 * Java type: com.ipartek.formacion.service.GetAlumnoByDniResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.service;


/**
 * A document containing one getAlumnoByDniResponse(@http://service.formacion.ipartek.com) element.
 *
 * This is a complex type.
 */
public interface GetAlumnoByDniResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAlumnoByDniResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5861B648FEAE049E624370FE870003EE").resolveHandle("getalumnobydniresponse7bf6doctype");
    
    /**
     * Gets the "getAlumnoByDniResponse" element
     */
    com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse getGetAlumnoByDniResponse();
    
    /**
     * Sets the "getAlumnoByDniResponse" element
     */
    void setGetAlumnoByDniResponse(com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse getAlumnoByDniResponse);
    
    /**
     * Appends and returns a new empty "getAlumnoByDniResponse" element
     */
    com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse addNewGetAlumnoByDniResponse();
    
    /**
     * An XML getAlumnoByDniResponse(@http://service.formacion.ipartek.com).
     *
     * This is a complex type.
     */
    public interface GetAlumnoByDniResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAlumnoByDniResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5861B648FEAE049E624370FE870003EE").resolveHandle("getalumnobydniresponse8521elemtype");
        
        /**
         * Gets the "return" element
         */
        com.ipartek.formacion.pojo.xsd.Alumno getReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * True if has "return" element
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(com.ipartek.formacion.pojo.xsd.Alumno xreturn);
        
        /**
         * Appends and returns a new empty "return" element
         */
        com.ipartek.formacion.pojo.xsd.Alumno addNewReturn();
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * Unsets the "return" element
         */
        void unsetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse newInstance() {
              return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument.GetAlumnoByDniResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument newInstance() {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ipartek.formacion.service.GetAlumnoByDniResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ipartek.formacion.service.GetAlumnoByDniResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
