package com.rr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConfigRunner implements CommandLineRunner {

	@Value("${prop.config.a}")
	private String a;
	@Autowired
	private ConfigPropBean configPropBean;

	@Value("${prop.config.p}")
	private String p;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=========configApp-start================");
		System.out.println(" prop.config.a ---> " + a);
		System.out.println(" prop.config.p ---> " + p);
		System.out.println(" prop.config.a  bean ---> " + configPropBean.getA());
		System.out.println("=========configApp-end================");

	}

}
