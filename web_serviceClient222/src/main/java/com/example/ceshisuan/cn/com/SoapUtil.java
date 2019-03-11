package com.example.ceshisuan.cn.com;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.*;

public class SoapUtil {

    public Map<String,Object> map = new HashMap<String,Object>();

    public  Map parse(String soap) throws DocumentException{
        Document doc = DocumentHelper.parseText(soap);//报文转成doc对象
        Element root = doc.getRootElement();//获取根元素，准备递归解析这个XML树
        getCode(root);
        return map;
    }

    public  void getCode(Element root){
        if(root.elements()!=null){
            List<Element> list = root.elements();//如果当前跟节点有子节点，找到子节点
            for(Element e:list){//遍历每个节点
                if(e.elements().size()>0){
                    getCode(e);//当前节点不为空的话，递归遍历子节点；
                }
                if(e.elements().size()==0){
                    map.put(e.getName(), e.attributes());
                }//如果为叶子节点，那么直接把名字和值放入map
            }
        }
    }

    public static void main(String[]args) throws DocumentException{
        String soap = ChangeXmlToObj.getStr();
        Map map = new SoapUtil().parse(soap);
        //获得字段s:SourceSysId的值;
        List<Attribute>  id = (List<Attribute> )map.get("row");
        Map<String,String> map1=new HashMap<>();
        for (Attribute aaa:id
             ) {
            map1.put(aaa.getName(),aaa.getValue());
            System.out.println(aaa.getName()+"----"+aaa.getValue());
        }
        System.out.println("id=="+map1.get("ows_ID"));
    }

}
