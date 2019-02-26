package com.example.ceshisuan.webservice;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface UserService {


    @WebMethod
    String getName(@WebParam(name = "userId") String userId);


}
