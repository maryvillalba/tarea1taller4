package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;
//habilita  la arquitectura MVC DE SpRING
@EnableWebMvc 
//claase a gestionar por spring
@ComponentScan(basePackageClasses={HomeController.class}) 
public class AppWebConfiguration extends WebMvcConfigurerAdapter { 
 
	//definir un metodo  gestionado por spring
@Bean 
public InternalResourceViewResolver internalResourceViewResolver() { InternalResourceViewResolver resolver =new InternalResourceViewResolver();
resolver.setPrefix("/WEB-INF/views/"); 
resolver.setSuffix(".jsp"); 
return resolver; 
}} 
