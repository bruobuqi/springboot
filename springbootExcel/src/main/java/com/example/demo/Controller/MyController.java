package com.example.demo.Controller;

import com.example.demo.service.Myservice;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
        @Autowired
        Myservice myservice;
    @RequestMapping("/test")
    public  String test(){
        return "test";
    }
    @RequestMapping("/excel")
    public void exportExcelCommon(HttpServletRequest request, HttpServletResponse response ){


        HSSFWorkbook wb = myservice.export();
        response.setContentType("application/vnd.ms-excel");
        try {
            response.addHeader("Content-Disposition", "attachment;filename="+ java.net.URLEncoder.encode("我的表格", "UTF-8")+".xls");

        OutputStream outputStream = null;

            outputStream = response.getOutputStream();
        wb.write(outputStream);
        outputStream.flush();
        outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
