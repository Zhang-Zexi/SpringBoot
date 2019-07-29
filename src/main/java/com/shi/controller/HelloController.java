package com.shi.controller;

import com.frame.factoryBean.DoMethod;
import com.frame.factoryBean.DoMethodInter;
import com.frame.factoryBean.MyFactoryBean;
import com.shi.entity.User;
import com.shi.entity.ValidUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    DoMethodInter doMethodInter;

    @RequestMapping("/hello")
    public  String hello(){
        System.out.println("receive message...");
        return "Hello World";
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public List<User> getUser(){
        List<User> userList = new ArrayList<User>();
        for(int i=0;i<4;i++){
            User user = new User();
            user.setAge(i);
            user.setName(String.valueOf(i));
            user.setPass(null);
            userList.add(user);
        }
        return userList;
    }

    @RequestMapping(value = "/getUserByName/{name}",method = RequestMethod.GET)
    public  User getUserByName(@PathVariable  String name){
        User user = new User();
        user.setName(name);
        user.setAge(100);
        return user;
    }

    @RequestMapping(value = "/validUser")
    public void validUser(@Valid ValidUser validUser, BindingResult bindingResult){
        System.out.println(validUser.toString());
        if(bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            for (ObjectError error : errors) {
                System.out.println(error.getCode() + ": " + error.getDefaultMessage());
            }
        }
    }

    @RequestMapping("/factory")
    public String factory(){

//        doMethodInter.print();
        System.out.println("业务代码");
        return doMethodInter.printString();
    }
}
