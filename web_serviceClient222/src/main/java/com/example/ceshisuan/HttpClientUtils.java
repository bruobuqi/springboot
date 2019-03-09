package com.example.ceshisuan;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class HttpClientUtils {
   public static  byte[] readInputStream(InputStream inputStream) throws IOException {
    ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
    byte[] buff = new byte[100]; //buff用于存放循环读取的临时数据
    int rc = 0;
while ((rc = inputStream.read(buff, 0, 100)) > 0) {
        swapStream.write(buff, 0, rc);
    }
    byte[] in_b = swapStream.toByteArray(); //in_b为转换之后的结果
       return in_b;
   }
}
