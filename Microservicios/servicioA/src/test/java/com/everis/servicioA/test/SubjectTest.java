package com.everis.servicioA.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SubjectTest {
	
	
	 @Autowired
	    private MockMvc mockMvc;
	    
	    @Test
	    public void findAllSubject()throws Exception{
	  	  
	  	  this.mockMvc.perform(get("/listSubject")).andExpect(status().isOk())
	  	  .andExpect(content().contentType("application/json;charset=utf-8"));
	  	  
	    }
	    
	    @Test
	    public void findIdSubject()throws Exception{
	  	  
	  	  this.mockMvc.perform(get("/listSubject/1")).andExpect(status().isOk())
	  	  .andExpect(content().contentType("application/json;charset=utf-8"));
	  	  
	    }

}
