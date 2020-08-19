package com.spring.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class ConfigClientController {

	@Value("${msg:Config Server is not working. Please check...}")
	private String msg;

	@Value("${config.properties.name}")
	private String configValue;

	@GetMapping("/msg")
	public String getMsg() {
		return this.msg;
	}

	@GetMapping("/config")
	public String getConfig() {
		return this.configValue;
	}
}
