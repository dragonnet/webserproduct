package com.cb.webservicesntlm;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jcifs.smb.NtlmPasswordAuthentication;

@Configuration
public class HttpClientConfig {
    @Autowired
    private NtlmPasswordAuthentication ntlmPasswordAuthentication;

    @Bean
    public CloseableHttpClient httpClient() throws Exception {
        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY,
                new NTCredentials("cbarillas", "$Cb3525$", null, ""));

        return HttpClientBuilder.create()
                .setDefaultCredentialsProvider(credentialsProvider)
                .build();
    }
}
