package ws_demo.service;

import java.awt.Image;
import javax.activation.DataHandler;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;

@WebService
public interface AttachmentEngine {
    // 上传图片
    public boolean uploadImg(String name, @XmlMimeType("image/jpeg") Image img);
    // 下载图片
    @XmlMimeType("image/jpeg")
    public Image downloadImg(String name);
    // 上传二进制文件
    public boolean uploadBinary(String name, @XmlMimeType("application/octet-stream") DataHandler handler);
    // 下载二进制文件
    @XmlMimeType("application/octet-stream")
    public DataHandler downloadBinary(String name);
}