//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.19 at 05:31:49 PM IST 
//


package com.employee.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.employee.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmpId_QNAME = new QName("http://spring_ws.trg/employee", "empId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.employee.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeSkillsetResponse }
     * 
     */
    public EmployeeSkillsetResponse createEmployeeSkillsetResponse() {
        return new EmployeeSkillsetResponse();
    }

    /**
     * Create an instance of {@link EmployeeSkillsetRequest }
     * 
     */
    public EmployeeSkillsetRequest createEmployeeSkillsetRequest() {
        return new EmployeeSkillsetRequest();
    }

    /**
     * Create an instance of {@link EmployeeDetailsRequest }
     * 
     */
    public EmployeeDetailsRequest createEmployeeDetailsRequest() {
        return new EmployeeDetailsRequest();
    }

    /**
     * Create an instance of {@link EmployeeDetailsResponse }
     * 
     */
    public EmployeeDetailsResponse createEmployeeDetailsResponse() {
        return new EmployeeDetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://spring_ws.trg/employee", name = "empId")
    public JAXBElement<String> createEmpId(String value) {
        return new JAXBElement<String>(_EmpId_QNAME, String.class, null, value);
    }

}