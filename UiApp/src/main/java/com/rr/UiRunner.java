package com.rr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UiRunner implements CommandLineRunner {

	@Value("${prop.config.a}")
	private String a;
	
	@Value("${prop.ui.b}")
	private String b;

	@Autowired
	private ConfigPropBean configPropBean;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=========uiApp-start================");
		System.out.println(" prop.config.a ---> " + a);
		System.out.println(" prop.ui.b ---> " + b);
		System.out.println(" prop.config.a  bean ---> " + configPropBean.getA());
		System.out.println("=========uiApp-end================");

	}

}
