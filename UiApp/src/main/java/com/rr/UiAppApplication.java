package com.rr;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication(scanBasePackages="com.rr")
public class UiAppApplication extends SpringBootServletInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("=== callback -> onStartup");
		super.onStartup(servletContext);
	}

	@Override
	protected WebApplicationContext createRootApplicationContext(ServletContext servletContext) {
		System.out.println("=== callback -> createRootApplicationContext");
		return super.createRootApplicationContext(servletContext);
	}

	@Override
	protected SpringApplicationBuilder createSpringApplicationBuilder() {
		System.out.println("=== callback -> createSpringApplicationBuilder");
		return super.createSpringApplicationBuilder();
	}

	@Override
	protected WebApplicationContext run(SpringApplication application) {
		System.out.println("=== callback -> run");
		return super.run(application);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		System.out.println("=== callback -> configure");
		
		System.setProperty("spring.config.name", "application_config,application,application_test_profile_active");
		return	builder.sources(UiAppApplication.class);
	}

	public static void main(String[] args) {

		//System.setProperty("spring.config.additional-location", "file:/home/rr-reddy/Desktop/external_props2/");
		System.setProperty("spring.config.name", "application_config,application,application_dev_profile_active");
		SpringApplication.run(UiAppApplication.class, args);
	}

}
