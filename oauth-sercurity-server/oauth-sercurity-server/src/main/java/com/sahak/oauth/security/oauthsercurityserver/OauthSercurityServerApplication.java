package com.sahak.oauth.security.oauthsercurityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class OauthSercurityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthSercurityServerApplication.class, args);
	}
}
