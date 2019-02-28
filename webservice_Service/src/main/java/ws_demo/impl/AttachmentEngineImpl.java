package ws_demo.impl;

import ws_demo.service.AttachmentEngine;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

@MTOM
@WebService(endpointInterface="ws_demo.service.AttachmentEngine")
public class AttachmentEngineImpl implements AttachmentEngine {
    private final File saveDir = new File("d:/");
    // 将上传的图片   以参数name命名，并存储到d:/share/server目录下。
    @Override
    public boolean uploadImg(String name, @XmlMimeType("image/jpeg") Image img) {
        try {
            ImageIO.write((RenderedImage) img, "jpg", new File(saveDir, name));
        } catch (IOException e) {
            throw new WebServiceException("Fail to upload.");
        }
        return true;
    }
    // 获取d:/share/server下名为name的图片
    @Override
    @XmlMimeType("image/jpeg")
    public Image downloadImg(String name) {
        File image = new File(saveDir, name);
        try {
            return ImageIO.read(image);
        } catch (IOException e) {
            throw new WebServiceException("Fail to download.",e);
        }
    }
    // 将上传的文件    以参数name命名，并存储到d:/share/server目录下。
    @Override
    public boolean uploadBinary(String name,
                                @XmlMimeType("application/octet-stream") DataHandler handler) {
        try {
            handler.writeTo(new FileOutputStream(new File(saveDir, name)));
            return true;
        } catch (FileNotFoundException e) {
            throw new WebServiceException("Fail to upload.",e);
        } catch (IOException e) {
            throw new WebServiceException("Fail to upload.",e);
        }
    }
    // 获取d:/share/server下名为name的文件
    @Override
    @XmlMimeType("application/octet-stream")
    public DataHandler downloadBinary(String name) {
        return new DataHandler(new FileDataSource(new File(saveDir, name)));
    }
}