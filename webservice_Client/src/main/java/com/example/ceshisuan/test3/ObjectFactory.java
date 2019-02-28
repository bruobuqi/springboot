
package com.example.ceshisuan.test3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.ceshisuan.test3 package. 
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

    private final static QName _DownloadImgResponse_QNAME = new QName("http://service.ws_demo/", "downloadImgResponse");
    private final static QName _UploadBinary_QNAME = new QName("http://service.ws_demo/", "uploadBinary");
    private final static QName _DownloadBinary_QNAME = new QName("http://service.ws_demo/", "downloadBinary");
    private final static QName _UploadBinaryResponse_QNAME = new QName("http://service.ws_demo/", "uploadBinaryResponse");
    private final static QName _DownloadImg_QNAME = new QName("http://service.ws_demo/", "downloadImg");
    private final static QName _DownloadBinaryResponse_QNAME = new QName("http://service.ws_demo/", "downloadBinaryResponse");
    private final static QName _UploadImg_QNAME = new QName("http://service.ws_demo/", "uploadImg");
    private final static QName _UploadImgResponse_QNAME = new QName("http://service.ws_demo/", "uploadImgResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.ceshisuan.test3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadBinary }
     * 
     */
    public UploadBinary createUploadBinary() {
        return new UploadBinary();
    }

    /**
     * Create an instance of {@link DownloadImgResponse }
     * 
     */
    public DownloadImgResponse createDownloadImgResponse() {
        return new DownloadImgResponse();
    }

    /**
     * Create an instance of {@link DownloadImg }
     * 
     */
    public DownloadImg createDownloadImg() {
        return new DownloadImg();
    }

    /**
     * Create an instance of {@link DownloadBinary }
     * 
     */
    public DownloadBinary createDownloadBinary() {
        return new DownloadBinary();
    }

    /**
     * Create an instance of {@link UploadBinaryResponse }
     * 
     */
    public UploadBinaryResponse createUploadBinaryResponse() {
        return new UploadBinaryResponse();
    }

    /**
     * Create an instance of {@link UploadImg }
     * 
     */
    public UploadImg createUploadImg() {
        return new UploadImg();
    }

    /**
     * Create an instance of {@link DownloadBinaryResponse }
     * 
     */
    public DownloadBinaryResponse createDownloadBinaryResponse() {
        return new DownloadBinaryResponse();
    }

    /**
     * Create an instance of {@link UploadImgResponse }
     * 
     */
    public UploadImgResponse createUploadImgResponse() {
        return new UploadImgResponse();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws_demo/", name = "downloadImgResponse")
    public JAXBElement<DownloadImgResponse> createDownloadImgResponse(DownloadImgResponse value) {
        return new JAXBElement<DownloadImgResponse>(_DownloadImgResponse_QNAME, DownloadImgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadBinary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws_demo/", name = "uploadBinary")
    public JAXBElement<UploadBinary> createUploadBinary(UploadBinary value) {
        return new JAXBElement<UploadBinary>(_UploadBinary_QNAME, UploadBinary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadBinary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws_demo/", name = "downloadBinary")
    public JAXBElement<DownloadBinary> createDownloadBinary(DownloadBinary value) {
        return new JAXBElement<DownloadBinary>(_DownloadBinary_QNAME, DownloadBinary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadBinaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws_demo/", name = "uploadBinaryResponse")
    public JAXBElement<UploadBinaryResponse> createUploadBinaryResponse(UploadBinaryResponse value) {
        return new JAXBElement<UploadBinaryResponse>(_UploadBinaryResponse_QNAME, UploadBinaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws_demo/", name = "downloadImg")
    public JAXBElement<DownloadImg> createDownloadImg(DownloadImg value) {
        return new JAXBElement<DownloadImg>(_DownloadImg_QNAME, DownloadImg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadBinaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws_demo/", name = "downloadBinaryResponse")
    public JAXBElement<DownloadBinaryResponse> createDownloadBinaryResponse(DownloadBinaryResponse value) {
        return new JAXBElement<DownloadBinaryResponse>(_DownloadBinaryResponse_QNAME, DownloadBinaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws_demo/", name = "uploadImg")
    public JAXBElement<UploadImg> createUploadImg(UploadImg value) {
        return new JAXBElement<UploadImg>(_UploadImg_QNAME, UploadImg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws_demo/", name = "uploadImgResponse")
    public JAXBElement<UploadImgResponse> createUploadImgResponse(UploadImgResponse value) {
        return new JAXBElement<UploadImgResponse>(_UploadImgResponse_QNAME, UploadImgResponse.class, null, value);
    }

}
