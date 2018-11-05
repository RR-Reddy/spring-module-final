package com.rr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigPropBean {

	@Value("${prop.config.a}")
	private String a;

	public String getA() {
		return a;
	}
}
