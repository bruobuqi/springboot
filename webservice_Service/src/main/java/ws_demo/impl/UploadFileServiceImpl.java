package ws_demo.impl;
import ws_demo.service.UploadFileService;

import java.io.*;
import javax.activation.DataHandler;

/**
 1. <b>function:</b>Axis WebService完成文件上传服务器端
 */
@javax.jws.WebService
public class UploadFileServiceImpl implements UploadFileService {
    /*
     * 服务端,读取文件
     *fileContent 文件内容 fileName 文件名称
     */
@Override
    public void getValue(String fileContent,String fileName) {
        try {
            //	ReadConfig.PullConfigXml(); //调用自己写好的配置文件
            String filePaths="D:\\"+fileName;

            int temp = this.writeFile(filePaths, fileContent.getBytes("utf-8"));
            if(temp>=0) {
                System.out.println("写入文件成功！");
            }else {
                System.out.println("写入文件失败！");
            }
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }
    /*
     * 写入文件
     */
    @Override
    public int writeFile(String filePath, byte[] content) {

        //	LOGBean.logger("debug", "写文件[" + fileName + "]\n", context);
        System.out.println("开始写文件。。。。");
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(filePath,true);
            //Log4jBean.logger.info("准备写入文件");
            os.write(content);
            //Log4jBean.logger.info("开始刷新文件");
            os.flush();

        } catch (Exception e) {
            //LOGBean.logger("error", "写文件[" + fileName + "]失败 " + e.toString());
            return -1;
        } finally {
            try {
                if (null != os)
                    os.close();
            } catch (IOException e) {
            }
        }
        System.out.println("写入文件成功");
        os = null;
        //LOGBean.logger("debug", "写文件[" + fileName + "]成功", context);
        return 0;
    }

}


