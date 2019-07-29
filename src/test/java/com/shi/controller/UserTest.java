package com.shi.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class UserTest {

    private MockMvc mockMvc;

    @Before
    public void doBefore(){
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void  getTest() throws Exception {
        String returnStr = mockMvc.perform(MockMvcRequestBuilders.get("/getUser")).andReturn().getResponse().getContentAsString();
        System.out.println(returnStr);
    }
}
