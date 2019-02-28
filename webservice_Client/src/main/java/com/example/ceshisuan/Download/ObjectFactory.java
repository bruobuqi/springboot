
package com.example.ceshisuan.Download;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.ceshisuan.Download package. 
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

    private final static QName _GetValueResponse_QNAME = new QName("http://impl.ws_demo/", "getValueResponse");
    private final static QName _WriteFile_QNAME = new QName("http://impl.ws_demo/", "writeFile");
    private final static QName _WriteFileResponse_QNAME = new QName("http://impl.ws_demo/", "writeFileResponse");
    private final static QName _GetValue_QNAME = new QName("http://impl.ws_demo/", "getValue");
    private final static QName _WriteFileArg1_QNAME = new QName("", "arg1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.ceshisuan.Download
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetValue }
     * 
     */
    public GetValue createGetValue() {
        return new GetValue();
    }

    /**
     * Create an instance of {@link WriteFileResponse }
     * 
     */
    public WriteFileResponse createWriteFileResponse() {
        return new WriteFileResponse();
    }

    /**
     * Create an instance of {@link GetValueResponse }
     * 
     */
    public GetValueResponse createGetValueResponse() {
        return new GetValueResponse();
    }

    /**
     * Create an instance of {@link WriteFile }
     * 
     */
    public WriteFile createWriteFile() {
        return new WriteFile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "getValueResponse")
    public JAXBElement<GetValueResponse> createGetValueResponse(GetValueResponse value) {
        return new JAXBElement<GetValueResponse>(_GetValueResponse_QNAME, GetValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "writeFile")
    public JAXBElement<WriteFile> createWriteFile(WriteFile value) {
        return new JAXBElement<WriteFile>(_WriteFile_QNAME, WriteFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "writeFileResponse")
    public JAXBElement<WriteFileResponse> createWriteFileResponse(WriteFileResponse value) {
        return new JAXBElement<WriteFileResponse>(_WriteFileResponse_QNAME, WriteFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws_demo/", name = "getValue")
    public JAXBElement<GetValue> createGetValue(GetValue value) {
        return new JAXBElement<GetValue>(_GetValue_QNAME, GetValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = WriteFile.class)
    public JAXBElement<byte[]> createWriteFileArg1(byte[] value) {
        return new JAXBElement<byte[]>(_WriteFileArg1_QNAME, byte[].class, WriteFile.class, ((byte[]) value));
    }

}
