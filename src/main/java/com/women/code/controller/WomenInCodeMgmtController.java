package com.women.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author sanika
 *
 */

@RestController
public class WomenInCodeMgmtController {
  
	@Autowired
	private QueryDb queryDb; 
	
	@RequestMapping(value = "/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserRequest add() {
		return queryDb.saveToRepository();
		//return null;
	}
}
