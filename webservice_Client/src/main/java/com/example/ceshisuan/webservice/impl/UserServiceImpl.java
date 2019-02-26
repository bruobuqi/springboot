package com.example.ceshisuan.webservice.impl;



import com.example.ceshisuan.webservice.UserService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

   // private Map<String, User> userMap = new HashMap<String, User>();

    public UserServiceImpl() {
        //System.out.println("向实体类插入数据");
       /* User user = new User();
        user.setId("411001");
        user.setUsername("zhansan");
        user.setPassword("123456");
        userMap.put(user.getId(), user);

        user = new User();
        user.setId("411002");
        user.setUsername("lisi");
        user.setPassword("64513123");
        userMap.put(user.getId(), user);

        user = new User();
        user.setId("411003");
        user.setUsername("wangwu");
        user.setPassword("手动阀手动阀");
        userMap.put(user.getId(), user);*/
    }

    @Override
    public String getName(String userId) {
        return "liyd-" + userId;
    }


//    @Override
//    public User getUser(String userId) {
//        System.out.println("userMap是:" + userMap);
//        return userMap.get(userId);
//    }



}

