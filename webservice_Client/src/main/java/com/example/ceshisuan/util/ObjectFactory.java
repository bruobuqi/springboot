
package com.example.ceshisuan.util;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.ceshisuan.util package. 
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

    private final static QName _SayHello4_QNAME = new QName("http://impl.ws_demo/", "sayHello4");
    private final static QName _SayHello3_QNAME = new QName("http://impl.ws_demo/", "sayHello3");
    private final static QName _SayHello3Response_QNAME = new QName("http://impl.ws_demo/", "sayHello3Response");
    private final static QName _SayHello2_QNAME = new QName("http://impl.ws_demo/", "sayHello2");
    private final static QName _SayHelloResponse_QNAME = new QName("http://impl.ws_demo/", "sayHelloResponse");
    private final static QName _SayHello1_QNAME = new QName("http://impl.ws_demo/", "sayHello1");
    private final static QName _SayHello4Response_QNAME = new QName("http://impl.ws_demo/", "sayHello4Response");
    private final static QName _SayHello1Response_QNAME = new QName("http://impl.ws_demo/", "sayHello1Response");
    private final static QName _SayHello_QNAME = new QName("http://impl.ws_demo/", "sayHello");
    private final static QName _SayHello2Response_QNAME = new QName("http://impl.ws_demo/", "sayHello2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.ceshisuan.util
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello1Response }
     * 
     */
    public SayHello1Response createSayHello1Response() {
        return new SayHello1Response();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHello2Response }
     * 
     */
    public SayHello2Response createSayHello2Response() {
        return new SayHello2Response();
    }

    /**
     * Create an instance of {@link SayHello4Response }
     * 
     */
    public SayHello4Response createSayHello4Response() {
        return new SayHello4Response();
    }

    /**
     * Create an instance of {@link SayHello3Response }
     * 
     */
    public SayHello3Response createSayHello3Response() {
        return new SayHello3Response();
    }

    /**
     * Create an instance of {@link SayHello1 }
     * 
     */
    public SayHello1 createSayHello1() {
        return new SayHello1();
    }

    /**
     * Create an instance of {@link SayHello2 }
     * 
     */
    public SayHello2 createSayHello2() {
        return new SayHello2();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello3 }
     * 
     */
    public SayHello3 createSayHello3() {
        return new SayHello3();
    }

    /**
     * Create an instance of {@link SayHello4 }
     * 
     */
    public SayHello4 createSayHello4() {
        return new SayHello4();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello4")
    public JAXBElement<SayHello4> createSayHello4(SayHello4 value) {
        return new JAXBElement<SayHello4>(_SayHello4_QNAME, SayHello4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello3")
    public JAXBElement<SayHello3> createSayHello3(SayHello3 value) {
        return new JAXBElement<SayHello3>(_SayHello3_QNAME, SayHello3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello3Response")
    public JAXBElement<SayHello3Response> createSayHello3Response(SayHello3Response value) {
        return new JAXBElement<SayHello3Response>(_SayHello3Response_QNAME, SayHello3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello2")
    public JAXBElement<SayHello2> createSayHello2(SayHello2 value) {
        return new JAXBElement<SayHello2>(_SayHello2_QNAME, SayHello2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello1")
    public JAXBElement<SayHello1> createSayHello1(SayHello1 value) {
        return new JAXBElement<SayHello1>(_SayHello1_QNAME, SayHello1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello4Response")
    public JAXBElement<SayHello4Response> createSayHello4Response(SayHello4Response value) {
        return new JAXBElement<SayHello4Response>(_SayHello4Response_QNAME, SayHello4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello1Response")
    public JAXBElement<SayHello1Response> createSayHello1Response(SayHello1Response value) {
        return new JAXBElement<SayHello1Response>(_SayHello1Response_QNAME, SayHello1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "sayHello2Response")
    public JAXBElement<SayHello2Response> createSayHello2Response(SayHello2Response value) {
        return new JAXBElement<SayHello2Response>(_SayHello2Response_QNAME, SayHello2Response.class, null, value);
    }

}
