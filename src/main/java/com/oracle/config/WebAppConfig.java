package com.oracle.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "com.oracle")
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// JSP view resolver setup
		// if controller return customer --- /WEB-INF/views/customer.jsp
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

}
