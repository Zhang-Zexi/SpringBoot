package com.shi.controller;

import com.example.demo.DemoApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class RestFulTest {

    @Autowired
    private WebApplicationContext wc;

    MockMvc mockMvc;

    @Before
    public void doBefore(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wc).build();
//        mockMvc = MockMvcBuilders.standaloneSetup(new MessageController()).build();
    }

    @Test
    public void doTest() throws Exception {
        MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
        params.add("text", "text");
        params.add("summary", "summary");
        String str = mockMvc.perform(MockMvcRequestBuilders.post("/create").params(params)).andReturn().getResponse().getContentAsString();
        System.out.println(str);
    }
}
