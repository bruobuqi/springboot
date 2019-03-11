package com.example.ceshisuan;

import com.example.ceshisuan.ws_02.ListsSoap;
import com.example.ceshisuan.ws_demo.*;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Holder;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


@RestController
public class CesuanController2 {

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
        System.err.println(contents.length);
        String SourceUrl ="http://void(0)";

        String oDestinationUrl="http://eip.gcl-power.com/GCLResource/NewsPicLibrary/新能源/信息化新闻/4478186a65fa4c84865b0c5cee909f1d.jpg";
        List<String> oDestinationUrls = new ArrayList<>();
        oDestinationUrls.add(oDestinationUrl);
        ObjectFactory objectFactory=new ObjectFactory();
        DestinationUrlCollection DestinationUrls=objectFactory.createDestinationUrlCollection();
        DestinationUrls.getString().addAll(oDestinationUrls);
        String[] strings = new String[oDestinationUrls.size()];

        oDestinationUrls.toArray(strings);

        FieldInformationCollection fieldInformationCollection=new FieldInformationCollection();
        Holder<Long> copyIntoItemsResult=new Holder<>();
        Holder<CopyResultCollection> results=new Holder<>();
        copySoap.copyIntoItems(SourceUrl,DestinationUrls,fieldInformationCollection,contents,copyIntoItemsResult,results);
        //   copySoap.copyIntoItemsLocal(SourceUrl,DestinationUrls,copyIntoItemsResult,results);
       // copySoap.getItem();
        Holder<Long> getItemResult=new Holder();
        Holder<FieldInformationCollection> fields=new Holder<>();
        Holder<byte[]> stream=new Holder<>();
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
