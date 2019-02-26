/*
package com.example.ceshisuan.config;


import com.example.ceshisuan.webservice.UserService;
import com.example.ceshisuan.webservice.impl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.xml.ws.Endpoint;

*/
/**
 * cxf配置
 *
 * 访问地址
 *   http://localhost:端口/工程名称/接口名?wsdl
 *   两种方式:
 *      1) http://localhost:8050/webservice/services
 *         http://localhost:8050/webservice/services/TestService?wsdl
 *      2) http://localhost:8050/webservice/UserService?wsdl
 *
 *//*

@Configuration
public class CxfConfig {

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        // 使用前缀
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
        //return new ServletRegistrationBean(new CXFServlet(), "/*");
    }
    //自动注入spring boot默认的上传配置
    @Autowired
    private MultipartConfigElement multipartConfigElement;

    */
/**
     * 添加普通的controller处理
     * @return
     *//*

    @Bean
    public ServletRegistrationBean dispatcherRestServlet() {
        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();
        //替换成自己想买的controller包路径
        context.scan("com.bestitu.controller");
        DispatcherServlet disp = new DispatcherServlet(context);
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(disp);
        registrationBean.setLoadOnStartup(1);
        registrationBean.setMultipartConfig(multipartConfigElement);
        //映射路径自定义,必须设置一个不重复的名称
        registrationBean.addUrlMappings("/*");
        registrationBean.setName("rest");
        return registrationBean;
    }


    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService());
        endpoint.publish("/UserService");
        return endpoint;
    }


//    @Bean
//    public TestService testService() {
//        return new TestServiceImpl();
//    }


}
*/
