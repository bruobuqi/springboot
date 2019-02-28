package ws_demo.service;

import javax.activation.DataHandler;
import javax.jws.WebMethod;

@javax.jws.WebService
public interface UploadFileService {
    @WebMethod
    public void getValue(String fileContent,String fileName);
    @WebMethod
    public int writeFile(String filePath, byte[] content);
}
