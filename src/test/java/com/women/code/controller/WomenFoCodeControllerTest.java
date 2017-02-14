/**
 * 
 */
package com.women.code.controller;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.women.code.WomenForCodeTestBase;

/**
 * @author sanika
 *
 */
public class WomenFoCodeControllerTest extends WomenForCodeTestBase {

	private MockMvc mockMvc;
	
	@InjectMocks 
	private WomenInCodeMgmtController womenInCodeMgmtController; 
	
	@Mock 
	private QueryDb queryDb;
	
	@Before 
	public void setUp(){
		super.setUp();
		this.mockMvc = MockMvcBuilders.standaloneSetup(this.womenInCodeMgmtController).build();
	}
	
	@Test
	public void add_200() throws Exception{
		assertNotNull(this.mockMvc.perform(get("/add")));
		this.mockMvc.perform(get("/add").accept(MediaType.APPLICATION_JSON_VALUE));
	}
}
