package com.example.ceshisuan;

import com.example.ceshisuan.cn.com.ClientLoginInterceptor;
import com.example.ceshisuan.ws_02.ListsSoap;
import com.example.ceshisuan.ws_demo.*;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Holder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


@RestController
public class CesuanController {

    @RequestMapping("nihao2")
    public Object nihao2() throws Exception {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(CopySoap.class);
        factory.setAddress("http://eip.gcl-power.com/_vti_bin/Copy.asmx");

        factory.setUsername("spsdbadmin");
        factory.setPassword("Gclpower#0723");

        CopySoap copySoap = (CopySoap) factory.create();

      /*  InputStream is = new FileInputStream("/home/bruobuqi/Pictures/001.jpg");
        byte[] contents=     HttpClientUtils.readInputStream(is);*/
        File file = new File("/home/bruobuqi/Pictures/001.jpg");
        byte[] contents = Files.readAllBytes(file.toPath());
        System.out.println(contents.length);
        String oSourceUrl ="http://void(0)";

        String oDestinationUrl="http://eip.gcl-power.com/GCLResource/NewsPicLibrary/新能源/信息化新闻/4478186a65fa4c84865b0c5cee909f1d.jpg";
        List<String> oDestinationUrls = new ArrayList<>();
        oDestinationUrls.add(oDestinationUrl);
        ObjectFactory objectFactory=new ObjectFactory();
        DestinationUrlCollection destinationUrlCollection=objectFactory.createDestinationUrlCollection();
        destinationUrlCollection.getString().addAll(oDestinationUrls);
        FieldInformationCollection fieldInformationCollection=new FieldInformationCollection();
        Holder<Long> copyIntoItemsResult=new Holder<>();
        Holder<CopyResultCollection> results=new Holder<>();
      //  copySoap.copyIntoItems(oSourceUrl,destinationUrlCollection,fieldInformationCollection,contents,copyIntoItemsResult,results);
       // copySoap.getItem();
        javax.xml.ws.Holder<Long> getItemResult=new Holder();
        javax.xml.ws.Holder<FieldInformationCollection> fields=new Holder<>();
        javax.xml.ws.Holder<byte[]> stream=new Holder<>();
      // copySoap.getItem("http://eip.gcl-power.com/GCLResource/NewsPicLibrary/新能源/信息化新闻/",getItemResult,fields,stream);
        System.out.println("connection result:");
        return stream;
    }
    @RequestMapping("nihao3")
    public Object nihao3() throws Exception {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(ListsSoap.class);
        factory.setAddress("http://eip.gcl-power.com/_vti_bin/Lists.asmx");

     factory.setUsername("spsdbadmin");
     factory.setPassword("Gclpower#0723");

        ListsSoap ssssss = (ListsSoap) factory.create();
        ssssss.getList("新闻");
        System.out.println("connection result:");
        return   null;
    }


}
