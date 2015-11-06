/*
 * An XML document type.
 * Localname: getAlumnoByDni
 * Namespace: http://service.formacion.ipartek.com
 * Java type: com.ipartek.formacion.service.GetAlumnoByDniDocument
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.service;


/**
 * A document containing one getAlumnoByDni(@http://service.formacion.ipartek.com) element.
 *
 * This is a complex type.
 */
public interface GetAlumnoByDniDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAlumnoByDniDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5861B648FEAE049E624370FE870003EE").resolveHandle("getalumnobydnie4b7doctype");
    
    /**
     * Gets the "getAlumnoByDni" element
     */
    com.ipartek.formacion.service.GetAlumnoByDniDocument.GetAlumnoByDni getGetAlumnoByDni();
    
    /**
     * Sets the "getAlumnoByDni" element
     */
    void setGetAlumnoByDni(com.ipartek.formacion.service.GetAlumnoByDniDocument.GetAlumnoByDni getAlumnoByDni);
    
    /**
     * Appends and returns a new empty "getAlumnoByDni" element
     */
    com.ipartek.formacion.service.GetAlumnoByDniDocument.GetAlumnoByDni addNewGetAlumnoByDni();
    
    /**
     * An XML getAlumnoByDni(@http://service.formacion.ipartek.com).
     *
     * This is a complex type.
     */
    public interface GetAlumnoByDni extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAlumnoByDni.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5861B648FEAE049E624370FE870003EE").resolveHandle("getalumnobydni6941elemtype");
        
        /**
         * Gets the "args0" element
         */
        java.lang.String getArgs0();
        
        /**
         * Gets (as xml) the "args0" element
         */
        org.apache.xmlbeans.XmlString xgetArgs0();
        
        /**
         * Tests for nil "args0" element
         */
        boolean isNilArgs0();
        
        /**
         * True if has "args0" element
         */
        boolean isSetArgs0();
        
        /**
         * Sets the "args0" element
         */
        void setArgs0(java.lang.String args0);
        
        /**
         * Sets (as xml) the "args0" element
         */
        void xsetArgs0(org.apache.xmlbeans.XmlString args0);
        
        /**
         * Nils the "args0" element
         */
        void setNilArgs0();
        
        /**
         * Unsets the "args0" element
         */
        void unsetArgs0();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.ipartek.formacion.service.GetAlumnoByDniDocument.GetAlumnoByDni newInstance() {
              return (com.ipartek.formacion.service.GetAlumnoByDniDocument.GetAlumnoByDni) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.ipartek.formacion.service.GetAlumnoByDniDocument.GetAlumnoByDni newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.ipartek.formacion.service.GetAlumnoByDniDocument.GetAlumnoByDni) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument newInstance() {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ipartek.formacion.service.GetAlumnoByDniDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ipartek.formacion.service.GetAlumnoByDniDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
