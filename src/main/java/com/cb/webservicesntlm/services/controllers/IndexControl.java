package com.cb.webservicesntlm.services.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.webservicesntlm.services.IService;

@RestController
public class IndexControl {
	
	@Autowired
	private IService serviceProxy;

	@GetMapping(value = "/vendedores/findall", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getVendedores() throws IOException {
		return serviceProxy.getResponse();
	}
}
