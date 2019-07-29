package com.frame.factoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {

    private Class<?> clazz;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入动态代理方法");

        return method.invoke(clazz.newInstance(),args);
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }
}
