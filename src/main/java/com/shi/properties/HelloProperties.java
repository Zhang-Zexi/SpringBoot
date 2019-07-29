package com.shi.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "database")
@PropertySource("classpath:application.properties")
public class HelloProperties {

    @Value("${project.owner}")
    private String projectOwner;

    private String url;

    private String dbname;

    @RequestMapping("/getOwner")
    public String getOwner(){
        System.out.println("in properties:"+projectOwner);
        System.out.println("url:"+url);
        System.out.println("dbname:"+dbname);


        return projectOwner;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }
}
