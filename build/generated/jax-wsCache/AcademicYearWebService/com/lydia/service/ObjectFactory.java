
package com.lydia.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lydia.service package. 
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

    private final static QName _AddAcademicYearResponse_QNAME = new QName("http://service.lydia.com/", "addAcademicYearResponse");
    private final static QName _ShowAllAcademicYear_QNAME = new QName("http://service.lydia.com/", "showAllAcademicYear");
    private final static QName _UpdateAcademicYearResponse_QNAME = new QName("http://service.lydia.com/", "updateAcademicYearResponse");
    private final static QName _DeleteAcademicYear_QNAME = new QName("http://service.lydia.com/", "deleteAcademicYear");
    private final static QName _AddAcademicYear_QNAME = new QName("http://service.lydia.com/", "addAcademicYear");
    private final static QName _DeleteAcademicYearResponse_QNAME = new QName("http://service.lydia.com/", "deleteAcademicYearResponse");
    private final static QName _UpdateAcademicYear_QNAME = new QName("http://service.lydia.com/", "updateAcademicYear");
    private final static QName _ShowAllAcademicYearResponse_QNAME = new QName("http://service.lydia.com/", "showAllAcademicYearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lydia.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteAcademicYear }
     * 
     */
    public DeleteAcademicYear createDeleteAcademicYear() {
        return new DeleteAcademicYear();
    }

    /**
     * Create an instance of {@link AddAcademicYear }
     * 
     */
    public AddAcademicYear createAddAcademicYear() {
        return new AddAcademicYear();
    }

    /**
     * Create an instance of {@link DeleteAcademicYearResponse }
     * 
     */
    public DeleteAcademicYearResponse createDeleteAcademicYearResponse() {
        return new DeleteAcademicYearResponse();
    }

    /**
     * Create an instance of {@link UpdateAcademicYear }
     * 
     */
    public UpdateAcademicYear createUpdateAcademicYear() {
        return new UpdateAcademicYear();
    }

    /**
     * Create an instance of {@link ShowAllAcademicYearResponse }
     * 
     */
    public ShowAllAcademicYearResponse createShowAllAcademicYearResponse() {
        return new ShowAllAcademicYearResponse();
    }

    /**
     * Create an instance of {@link AddAcademicYearResponse }
     * 
     */
    public AddAcademicYearResponse createAddAcademicYearResponse() {
        return new AddAcademicYearResponse();
    }

    /**
     * Create an instance of {@link ShowAllAcademicYear }
     * 
     */
    public ShowAllAcademicYear createShowAllAcademicYear() {
        return new ShowAllAcademicYear();
    }

    /**
     * Create an instance of {@link UpdateAcademicYearResponse }
     * 
     */
    public UpdateAcademicYearResponse createUpdateAcademicYearResponse() {
        return new UpdateAcademicYearResponse();
    }

    /**
     * Create an instance of {@link AcademicYear }
     * 
     */
    public AcademicYear createAcademicYear() {
        return new AcademicYear();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAcademicYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lydia.com/", name = "addAcademicYearResponse")
    public JAXBElement<AddAcademicYearResponse> createAddAcademicYearResponse(AddAcademicYearResponse value) {
        return new JAXBElement<AddAcademicYearResponse>(_AddAcademicYearResponse_QNAME, AddAcademicYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllAcademicYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lydia.com/", name = "showAllAcademicYear")
    public JAXBElement<ShowAllAcademicYear> createShowAllAcademicYear(ShowAllAcademicYear value) {
        return new JAXBElement<ShowAllAcademicYear>(_ShowAllAcademicYear_QNAME, ShowAllAcademicYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAcademicYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lydia.com/", name = "updateAcademicYearResponse")
    public JAXBElement<UpdateAcademicYearResponse> createUpdateAcademicYearResponse(UpdateAcademicYearResponse value) {
        return new JAXBElement<UpdateAcademicYearResponse>(_UpdateAcademicYearResponse_QNAME, UpdateAcademicYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAcademicYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lydia.com/", name = "deleteAcademicYear")
    public JAXBElement<DeleteAcademicYear> createDeleteAcademicYear(DeleteAcademicYear value) {
        return new JAXBElement<DeleteAcademicYear>(_DeleteAcademicYear_QNAME, DeleteAcademicYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAcademicYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lydia.com/", name = "addAcademicYear")
    public JAXBElement<AddAcademicYear> createAddAcademicYear(AddAcademicYear value) {
        return new JAXBElement<AddAcademicYear>(_AddAcademicYear_QNAME, AddAcademicYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAcademicYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lydia.com/", name = "deleteAcademicYearResponse")
    public JAXBElement<DeleteAcademicYearResponse> createDeleteAcademicYearResponse(DeleteAcademicYearResponse value) {
        return new JAXBElement<DeleteAcademicYearResponse>(_DeleteAcademicYearResponse_QNAME, DeleteAcademicYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAcademicYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lydia.com/", name = "updateAcademicYear")
    public JAXBElement<UpdateAcademicYear> createUpdateAcademicYear(UpdateAcademicYear value) {
        return new JAXBElement<UpdateAcademicYear>(_UpdateAcademicYear_QNAME, UpdateAcademicYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllAcademicYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lydia.com/", name = "showAllAcademicYearResponse")
    public JAXBElement<ShowAllAcademicYearResponse> createShowAllAcademicYearResponse(ShowAllAcademicYearResponse value) {
        return new JAXBElement<ShowAllAcademicYearResponse>(_ShowAllAcademicYearResponse_QNAME, ShowAllAcademicYearResponse.class, null, value);
    }

}
