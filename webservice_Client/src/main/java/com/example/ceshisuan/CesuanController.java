package com.example.ceshisuan;

import com.example.ceshisuan.util.User;
import com.example.ceshisuan.util.WebServiceImplService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
