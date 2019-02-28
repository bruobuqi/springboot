package com.example.ceshisuan;

import com.example.ceshisuan.Download.UploadFileServiceImplService;
import com.example.ceshisuan.test3.AttachmentEngine;
import com.example.ceshisuan.test3.AttachmentEngineImplService;
import com.example.ceshisuan.util.User;
import com.example.ceshisuan.util.WebServiceImplService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.xml.ws.soap.MTOMFeature;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileOutputStream;


@RestController
public class CesuanController {
    @RequestMapping("nihao")
    public Object nihao() throws Exception {

        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8081/wsServeice?wsdl");
        Object[] objects = new Object[0];
        try {
            User user=new User();
            user.setId("0000");
            user.setName("0001111");
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("sayHello", user);
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

        return  objects;
    }
    @RequestMapping("nihao2")
    public Object nihao2() throws Exception {
        WebServiceImplService webServiceImplService=new WebServiceImplService();
        User user=new User();
        user.setId("000");
        user.setName("888");
        User result = webServiceImplService.getWebServiceImplPort().sayHello(user);
        String result2 = webServiceImplService.getWebServiceImplPort().sayHello2("2252");
        System.out.println("===========================================");
        System.out.println(result2);
        System.out.println("===========================================");

        return  result;
    }
    @RequestMapping("nihao3")
    public Object nihao3() throws Exception {
        UploadFileServiceImplService uploadFileServiceImplService=new UploadFileServiceImplService();
        uploadFileServiceImplService.getUploadFileServiceImplPort().getValue("aa","ddffa");
        String result="dd";
        String result2="000";
        return  result;
    }
    private static final File uploadDir = new File("d:/client/upload");
    private static final File downloadDir = new File("d:/client/download");
    @RequestMapping("nihao4")
    public Object nihao4() throws Exception {
        // 生成一个开启MTOM的port
        AttachmentEngine engine = new AttachmentEngineImplService().getAttachmentEngineImplPort(new MTOMFeature());
        // 将upload目录下的a.JPG以另一个名字photo.jpg上传
        engine.uploadImg("photo.jpg", ImageIO.read(new File(uploadDir, "0.JPG")));
        // 从服务器端重新获取photo.jpg
        Image img = engine.downloadImg("photo.jpg");
        // 将服务器端获取的photo.jpg以download.jpg的名字存到download目录中。
        ImageIO.write((RenderedImage) img, "jpg", new File(downloadDir, "download.jpg"));
//        // 上传b.pdf，改名为test.pdf
//        engine.uploadBinary("test.pdf", new DataHandler(new FileDataSource(new File(uploadDir, "b.pdf"))));
//        // 下载test.pdf
//        DataHandler handler = engine.downloadBinary("test.pdf");
//        // 将下载的test.pdf存入download目录
//        handler.writeTo(new FileOutputStream(new File(downloadDir, "download.pdf")));
        return  "000";
    }

}
