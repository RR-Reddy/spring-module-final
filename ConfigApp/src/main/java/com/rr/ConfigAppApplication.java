package com.rr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigAppApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("config called");
//System.setProperty("spring.config.name", "application_config");
		SpringApplication.run(ConfigAppApplication.class, args);
	}

}
