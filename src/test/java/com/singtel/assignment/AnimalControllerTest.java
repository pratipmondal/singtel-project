package com.singtel.assignment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class AnimalControllerTest{
    @Autowired
    protected MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getWalkableCount() throws Exception {
        MockHttpServletRequestBuilder getWalkableCount = get("/animal/api/v1/walkableCount?animals=bird,caterpillar,cat,dog");
        mvc.perform(getWalkableCount).andExpect(status().isOk());
    }

    @Test
    public void getFlyableCount() throws Exception {
        MockHttpServletRequestBuilder getFlyableCount = get("/animal/api/v1/flyableCount?animals=bird,caterpillar,cat,dog,duck,clownfish");
        mvc.perform(getFlyableCount).andExpect(status().isOk());
    }

    @Test
    public void getSingableCount() throws Exception {
        MockHttpServletRequestBuilder getSingableCount = get("/animal/api/v1/singableCount?animals=bird,caterpillar,cat,dog,parrot,rooster");
        mvc.perform(getSingableCount).andExpect(status().isOk());
    }

    @Test
    public void getSwimmableCount() throws Exception {
        MockHttpServletRequestBuilder getSwimmableCount = get("/animal/api/v1/swimmableCount?animals=bird,caterpillar,cat,dog,fish");
        mvc.perform(getSwimmableCount).andExpect(status().isOk());
    }

    @Test
    public void getWalkableCountFail() throws Exception {
        MockHttpServletRequestBuilder getWalkableCount = get("/animal/api/v1/walkableCount?animals=bird,caterpillar,cat,dog1");
        mvc.perform(getWalkableCount).andExpect(status().isUnprocessableEntity());
    }
}