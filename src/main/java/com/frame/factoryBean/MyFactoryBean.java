package com.frame.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Required;

import java.lang.reflect.Proxy;

public class MyFactoryBean<T> extends InvocationHandlerImpl implements FactoryBean<T> {

    private Class<?> serviceInterface;

    @Override
    public T getObject() throws Exception {
        System.out.println("进入Spring的FactoryBean!");
        return (T)Proxy.newProxyInstance(getClass().getClassLoader(),new Class[]{serviceInterface},this);
    }

    @Override
    public Class<?> getObjectType() {
        return serviceInterface;
    }

    public Class<?> getServiceInterface() {
        return serviceInterface;
    }

    @Required
    public void setServiceInterface(Class<?> serviceInterface) {
        this.serviceInterface = serviceInterface;
    }
}
