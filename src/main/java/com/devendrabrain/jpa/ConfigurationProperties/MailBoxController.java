package com.devendrabrain.jpa.ConfigurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devendrabrain.jpa.ConfigurationProperties.dto.MailBox;

@RestController
public class MailBoxController {

	@Autowired
	MailBox box;
	
	
	@GetMapping("/mailbox/info")
	public MailBox mailBox() {
		return box;
	}
}
