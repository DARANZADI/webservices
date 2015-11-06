/*
 * XML Type:  Alumno
 * Namespace: http://pojo.formacion.ipartek.com/xsd
 * Java type: com.ipartek.formacion.pojo.xsd.Alumno
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.pojo.xsd;


/**
 * An XML Alumno(@http://pojo.formacion.ipartek.com/xsd).
 *
 * This is a complex type.
 */
public interface Alumno extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Alumno.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5861B648FEAE049E624370FE870003EE").resolveHandle("alumno12b8type");
    
    /**
     * Gets the "apellido1" element
     */
    java.lang.String getApellido1();
    
    /**
     * Gets (as xml) the "apellido1" element
     */
    org.apache.xmlbeans.XmlString xgetApellido1();
    
    /**
     * Tests for nil "apellido1" element
     */
    boolean isNilApellido1();
    
    /**
     * True if has "apellido1" element
     */
    boolean isSetApellido1();
    
    /**
     * Sets the "apellido1" element
     */
    void setApellido1(java.lang.String apellido1);
    
    /**
     * Sets (as xml) the "apellido1" element
     */
    void xsetApellido1(org.apache.xmlbeans.XmlString apellido1);
    
    /**
     * Nils the "apellido1" element
     */
    void setNilApellido1();
    
    /**
     * Unsets the "apellido1" element
     */
    void unsetApellido1();
    
    /**
     * Gets the "apellido2" element
     */
    java.lang.String getApellido2();
    
    /**
     * Gets (as xml) the "apellido2" element
     */
    org.apache.xmlbeans.XmlString xgetApellido2();
    
    /**
     * Tests for nil "apellido2" element
     */
    boolean isNilApellido2();
    
    /**
     * True if has "apellido2" element
     */
    boolean isSetApellido2();
    
    /**
     * Sets the "apellido2" element
     */
    void setApellido2(java.lang.String apellido2);
    
    /**
     * Sets (as xml) the "apellido2" element
     */
    void xsetApellido2(org.apache.xmlbeans.XmlString apellido2);
    
    /**
     * Nils the "apellido2" element
     */
    void setNilApellido2();
    
    /**
     * Unsets the "apellido2" element
     */
    void unsetApellido2();
    
    /**
     * Gets the "asignaturas" element
     */
    org.apache.xmlbeans.XmlObject getAsignaturas();
    
    /**
     * Tests for nil "asignaturas" element
     */
    boolean isNilAsignaturas();
    
    /**
     * True if has "asignaturas" element
     */
    boolean isSetAsignaturas();
    
    /**
     * Sets the "asignaturas" element
     */
    void setAsignaturas(org.apache.xmlbeans.XmlObject asignaturas);
    
    /**
     * Appends and returns a new empty "asignaturas" element
     */
    org.apache.xmlbeans.XmlObject addNewAsignaturas();
    
    /**
     * Nils the "asignaturas" element
     */
    void setNilAsignaturas();
    
    /**
     * Unsets the "asignaturas" element
     */
    void unsetAsignaturas();
    
    /**
     * Gets the "codigo" element
     */
    int getCodigo();
    
    /**
     * Gets (as xml) the "codigo" element
     */
    org.apache.xmlbeans.XmlInt xgetCodigo();
    
    /**
     * True if has "codigo" element
     */
    boolean isSetCodigo();
    
    /**
     * Sets the "codigo" element
     */
    void setCodigo(int codigo);
    
    /**
     * Sets (as xml) the "codigo" element
     */
    void xsetCodigo(org.apache.xmlbeans.XmlInt codigo);
    
    /**
     * Unsets the "codigo" element
     */
    void unsetCodigo();
    
    /**
     * Gets the "dni" element
     */
    java.lang.String getDni();
    
    /**
     * Gets (as xml) the "dni" element
     */
    org.apache.xmlbeans.XmlString xgetDni();
    
    /**
     * Tests for nil "dni" element
     */
    boolean isNilDni();
    
    /**
     * True if has "dni" element
     */
    boolean isSetDni();
    
    /**
     * Sets the "dni" element
     */
    void setDni(java.lang.String dni);
    
    /**
     * Sets (as xml) the "dni" element
     */
    void xsetDni(org.apache.xmlbeans.XmlString dni);
    
    /**
     * Nils the "dni" element
     */
    void setNilDni();
    
    /**
     * Unsets the "dni" element
     */
    void unsetDni();
    
    /**
     * Gets the "nombre" element
     */
    java.lang.String getNombre();
    
    /**
     * Gets (as xml) the "nombre" element
     */
    org.apache.xmlbeans.XmlString xgetNombre();
    
    /**
     * Tests for nil "nombre" element
     */
    boolean isNilNombre();
    
    /**
     * True if has "nombre" element
     */
    boolean isSetNombre();
    
    /**
     * Sets the "nombre" element
     */
    void setNombre(java.lang.String nombre);
    
    /**
     * Sets (as xml) the "nombre" element
     */
    void xsetNombre(org.apache.xmlbeans.XmlString nombre);
    
    /**
     * Nils the "nombre" element
     */
    void setNilNombre();
    
    /**
     * Unsets the "nombre" element
     */
    void unsetNombre();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.ipartek.formacion.pojo.xsd.Alumno newInstance() {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ipartek.formacion.pojo.xsd.Alumno parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ipartek.formacion.pojo.xsd.Alumno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
