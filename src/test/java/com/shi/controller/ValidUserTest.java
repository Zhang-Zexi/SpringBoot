package com.shi.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class ValidUserTest {

    private MockMvc mockMvc;

    @Before
    public void doBefore(){
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }
    @Test
    public void doTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/validUser").param("name","")
                .param("age","12")
                .param("pass","123465"));
    }
}
