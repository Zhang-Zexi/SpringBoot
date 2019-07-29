package com.shi.config;

import com.shi.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        MyFilter myFilter = new MyFilter();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("myFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

}
