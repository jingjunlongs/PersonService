package com.sap.personservice.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonService {	
	
	@GetMapping(path = { "/getName" })
	public String getMessage(HttpServletRequest request) throws Exception {
//		String msg = "Bob Dylan";
		String msg = "David Beckham 2.0";

		return msg;
	}
}
