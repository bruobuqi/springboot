package ws_demo.service;

import ws_demo.Entity.User;

import javax.jws.WebMethod;


@javax.jws.WebService
public interface WebService {
    @WebMethod
    User sayHello(User name);
    @WebMethod
    String sayHello1(String name);
    @WebMethod
    String sayHello2(String name);
    @WebMethod
    String sayHello3(String name);
    @WebMethod
    String sayHello4(String name);

}
