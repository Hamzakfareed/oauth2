package com.sahak.oauth.security.oauthsercurityclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "This is home page";
		
	}
	
	@GetMapping("/secure")
	@ResponseBody
	public String securePage() {
		return "This is secure page";
	}
}
