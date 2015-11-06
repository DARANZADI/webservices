/*
 * XML Type:  Alumno
 * Namespace: http://pojo.formacion.ipartek.com/xsd
 * Java type: com.ipartek.formacion.pojo.xsd.Alumno
 *
 * Automatically generated - do not modify.
 */
package com.ipartek.formacion.pojo.xsd.impl;
/**
 * An XML Alumno(@http://pojo.formacion.ipartek.com/xsd).
 *
 * This is a complex type.
 */
public class AlumnoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ipartek.formacion.pojo.xsd.Alumno
{
    
    public AlumnoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APELLIDO1$0 = 
        new javax.xml.namespace.QName("http://pojo.formacion.ipartek.com/xsd", "apellido1");
    private static final javax.xml.namespace.QName APELLIDO2$2 = 
        new javax.xml.namespace.QName("http://pojo.formacion.ipartek.com/xsd", "apellido2");
    private static final javax.xml.namespace.QName ASIGNATURAS$4 = 
        new javax.xml.namespace.QName("http://pojo.formacion.ipartek.com/xsd", "asignaturas");
    private static final javax.xml.namespace.QName CODIGO$6 = 
        new javax.xml.namespace.QName("http://pojo.formacion.ipartek.com/xsd", "codigo");
    private static final javax.xml.namespace.QName DNI$8 = 
        new javax.xml.namespace.QName("http://pojo.formacion.ipartek.com/xsd", "dni");
    private static final javax.xml.namespace.QName NOMBRE$10 = 
        new javax.xml.namespace.QName("http://pojo.formacion.ipartek.com/xsd", "nombre");
    
    
    /**
     * Gets the "apellido1" element
     */
    public java.lang.String getApellido1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDO1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apellido1" element
     */
    public org.apache.xmlbeans.XmlString xgetApellido1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO1$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "apellido1" element
     */
    public boolean isNilApellido1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO1$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "apellido1" element
     */
    public boolean isSetApellido1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APELLIDO1$0) != 0;
        }
    }
    
    /**
     * Sets the "apellido1" element
     */
    public void setApellido1(java.lang.String apellido1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDO1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDO1$0);
            }
            target.setStringValue(apellido1);
        }
    }
    
    /**
     * Sets (as xml) the "apellido1" element
     */
    public void xsetApellido1(org.apache.xmlbeans.XmlString apellido1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDO1$0);
            }
            target.set(apellido1);
        }
    }
    
    /**
     * Nils the "apellido1" element
     */
    public void setNilApellido1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDO1$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "apellido1" element
     */
    public void unsetApellido1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APELLIDO1$0, 0);
        }
    }
    
    /**
     * Gets the "apellido2" element
     */
    public java.lang.String getApellido2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDO2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apellido2" element
     */
    public org.apache.xmlbeans.XmlString xgetApellido2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO2$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "apellido2" element
     */
    public boolean isNilApellido2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO2$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "apellido2" element
     */
    public boolean isSetApellido2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APELLIDO2$2) != 0;
        }
    }
    
    /**
     * Sets the "apellido2" element
     */
    public void setApellido2(java.lang.String apellido2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDO2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDO2$2);
            }
            target.setStringValue(apellido2);
        }
    }
    
    /**
     * Sets (as xml) the "apellido2" element
     */
    public void xsetApellido2(org.apache.xmlbeans.XmlString apellido2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDO2$2);
            }
            target.set(apellido2);
        }
    }
    
    /**
     * Nils the "apellido2" element
     */
    public void setNilApellido2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDO2$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "apellido2" element
     */
    public void unsetApellido2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APELLIDO2$2, 0);
        }
    }
    
    /**
     * Gets the "asignaturas" element
     */
    public org.apache.xmlbeans.XmlObject getAsignaturas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ASIGNATURAS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "asignaturas" element
     */
    public boolean isNilAsignaturas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ASIGNATURAS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "asignaturas" element
     */
    public boolean isSetAsignaturas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASIGNATURAS$4) != 0;
        }
    }
    
    /**
     * Sets the "asignaturas" element
     */
    public void setAsignaturas(org.apache.xmlbeans.XmlObject asignaturas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ASIGNATURAS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ASIGNATURAS$4);
            }
            target.set(asignaturas);
        }
    }
    
    /**
     * Appends and returns a new empty "asignaturas" element
     */
    public org.apache.xmlbeans.XmlObject addNewAsignaturas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ASIGNATURAS$4);
            return target;
        }
    }
    
    /**
     * Nils the "asignaturas" element
     */
    public void setNilAsignaturas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ASIGNATURAS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ASIGNATURAS$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "asignaturas" element
     */
    public void unsetAsignaturas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASIGNATURAS$4, 0);
        }
    }
    
    /**
     * Gets the "codigo" element
     */
    public int getCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigo" element
     */
    public org.apache.xmlbeans.XmlInt xgetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODIGO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigo" element
     */
    public boolean isSetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGO$6) != 0;
        }
    }
    
    /**
     * Sets the "codigo" element
     */
    public void setCodigo(int codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGO$6);
            }
            target.setIntValue(codigo);
        }
    }
    
    /**
     * Sets (as xml) the "codigo" element
     */
    public void xsetCodigo(org.apache.xmlbeans.XmlInt codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODIGO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODIGO$6);
            }
            target.set(codigo);
        }
    }
    
    /**
     * Unsets the "codigo" element
     */
    public void unsetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGO$6, 0);
        }
    }
    
    /**
     * Gets the "dni" element
     */
    public java.lang.String getDni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DNI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dni" element
     */
    public org.apache.xmlbeans.XmlString xgetDni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DNI$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "dni" element
     */
    public boolean isNilDni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DNI$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "dni" element
     */
    public boolean isSetDni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DNI$8) != 0;
        }
    }
    
    /**
     * Sets the "dni" element
     */
    public void setDni(java.lang.String dni)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DNI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DNI$8);
            }
            target.setStringValue(dni);
        }
    }
    
    /**
     * Sets (as xml) the "dni" element
     */
    public void xsetDni(org.apache.xmlbeans.XmlString dni)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DNI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DNI$8);
            }
            target.set(dni);
        }
    }
    
    /**
     * Nils the "dni" element
     */
    public void setNilDni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DNI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DNI$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "dni" element
     */
    public void unsetDni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DNI$8, 0);
        }
    }
    
    /**
     * Gets the "nombre" element
     */
    public java.lang.String getNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombre" element
     */
    public org.apache.xmlbeans.XmlString xgetNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nombre" element
     */
    public boolean isNilNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "nombre" element
     */
    public boolean isSetNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMBRE$10) != 0;
        }
    }
    
    /**
     * Sets the "nombre" element
     */
    public void setNombre(java.lang.String nombre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRE$10);
            }
            target.setStringValue(nombre);
        }
    }
    
    /**
     * Sets (as xml) the "nombre" element
     */
    public void xsetNombre(org.apache.xmlbeans.XmlString nombre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRE$10);
            }
            target.set(nombre);
        }
    }
    
    /**
     * Nils the "nombre" element
     */
    public void setNilNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "nombre" element
     */
    public void unsetNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMBRE$10, 0);
        }
    }
}
