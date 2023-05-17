package com.cb.webservicesntlm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jcifs.smb.NtlmPasswordAuthentication;

@Configuration
public class JcifsConfig {

    @Value("${ntlm.username}")
    private String username;

    @Value("${ntlm.password}")
    private String password;

    @Bean
    public NtlmPasswordAuthentication ntlmPasswordAuthentication() {
        return new NtlmPasswordAuthentication("", username, password);
    }
}
