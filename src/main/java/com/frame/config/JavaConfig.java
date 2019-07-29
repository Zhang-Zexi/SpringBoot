package com.frame.config;

import com.frame.factoryBean.DoMethod;
import com.frame.factoryBean.DoMethodInter;
import com.frame.factoryBean.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = "doMethodInter")
    public MyFactoryBean myFactoryBean(){
        System.out.println("加载Bean工厂");
        MyFactoryBean myFactoryBean = new MyFactoryBean();
        myFactoryBean.setClazz(DoMethod.class);
        myFactoryBean.setServiceInterface(DoMethodInter.class);
        return  myFactoryBean;
    }
}
