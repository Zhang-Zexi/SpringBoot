package com.shi.controller;

import com.shi.properties.HelloProperties;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class PropertiesTest {

    @Value("${project.owner}")
    private String owner;
//    private MockMvc mockMvc;

//    @Before
//    public void doBefore(){
//        mockMvc = MockMvcBuilders.standaloneSetup(new HelloProperties()).build();
//    }

    @Test
    public void doTest() throws Exception {
//        String str=mockMvc.perform(MockMvcRequestBuilders.get("/getOwner")).andReturn().getResponse().getContentAsString();
//        System.out.println(str);
        System.out.println(owner);
    }
}
