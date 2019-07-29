package com.shi.controller;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class UserWithParamTest {

    private MockMvc mocmvc;

    @Test
    public void doTest() throws Exception {
        mocmvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
        String str = mocmvc.perform(MockMvcRequestBuilders.get("/getUserByName/xiaoming")).andReturn().getResponse().getContentAsString();
        System.out.println(str);
    }
}
