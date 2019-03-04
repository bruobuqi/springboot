
package com.example.ceshisuan.test3;

import java.awt.Image;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AttachmentEngine", targetNamespace = "http://service.ws_demo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AttachmentEngine {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadImg", targetNamespace = "http://service.ws_demo/", className = "com.example.ceshisuan.test3.UploadImg")
    @ResponseWrapper(localName = "uploadImgResponse", targetNamespace = "http://service.ws_demo/", className = "com.example.ceshisuan.test3.UploadImgResponse")
    @Action(input = "http://service.ws_demo/AttachmentEngine/uploadImgRequest", output = "http://service.ws_demo/AttachmentEngine/uploadImgResponse")
    public boolean uploadImg(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Image arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.awt.Image
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadImg", targetNamespace = "http://service.ws_demo/", className = "com.example.ceshisuan.test3.DownloadImg")
    @ResponseWrapper(localName = "downloadImgResponse", targetNamespace = "http://service.ws_demo/", className = "com.example.ceshisuan.test3.DownloadImgResponse")
    @Action(input = "http://service.ws_demo/AttachmentEngine/downloadImgRequest", output = "http://service.ws_demo/AttachmentEngine/downloadImgResponse")
    public Image downloadImg(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadBinary", targetNamespace = "http://service.ws_demo/", className = "com.example.ceshisuan.test3.UploadBinary")
    @ResponseWrapper(localName = "uploadBinaryResponse", targetNamespace = "http://service.ws_demo/", className = "com.example.ceshisuan.test3.UploadBinaryResponse")
    @Action(input = "http://service.ws_demo/AttachmentEngine/uploadBinaryRequest", output = "http://service.ws_demo/AttachmentEngine/uploadBinaryResponse")
    public boolean uploadBinary(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        DataHandler arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.activation.DataHandler
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadBinary", targetNamespace = "http://service.ws_demo/", className = "com.example.ceshisuan.test3.DownloadBinary")
    @ResponseWrapper(localName = "downloadBinaryResponse", targetNamespace = "http://service.ws_demo/", className = "com.example.ceshisuan.test3.DownloadBinaryResponse")
    @Action(input = "http://service.ws_demo/AttachmentEngine/downloadBinaryRequest", output = "http://service.ws_demo/AttachmentEngine/downloadBinaryResponse")
    public DataHandler downloadBinary(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}