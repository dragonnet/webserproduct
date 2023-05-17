package com.cb.webservicesntlm.services.impl;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.cb.webservicesntlm.services.IService;

@org.springframework.stereotype.Service
public class Service implements IService {

	@Autowired
	private CloseableHttpClient httpClient;

	@Override
	public String getResponse() throws IOException {

		HttpGet request = new HttpGet("http://20.55.200.64:8048/DynamicsNAV110/ODataV4/Company('Laboratorio%20Pharmalat%2C%20S.A.')/Productos");
		HttpResponse response = httpClient.execute(request);
		return EntityUtils.toString(response.getEntity());

	}

}
