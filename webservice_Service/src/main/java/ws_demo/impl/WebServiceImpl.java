package ws_demo.impl;

import ws_demo.Entity.User;
import ws_demo.service.WebService;

@javax.jws.WebService
public class WebServiceImpl implements WebService {

    @Override
    public User sayHello(User name) {
        name.setId("00001");

        return name;
    }

    @Override
    public String sayHello1(String name) {
        String said = name + ",Hellonhao~~";
        System.out.println(said);
        return said;
}

    @Override
    public String sayHello2(String name) {
        String said = name + ",Hellonaodsk~~";
        System.out.println(said);
        return said;
    }

    @Override
    public String sayHello3(String name) {
        String said = name + ",Hello~~";
        System.out.println(said);
        return said;
    }

    @Override
    public String sayHello4(String name) {
        String said = name + ",Hello~~";
        System.out.println(said);
        return said;
    }
}
