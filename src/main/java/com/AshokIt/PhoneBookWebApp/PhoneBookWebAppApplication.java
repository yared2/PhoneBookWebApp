package com.AshokIt.PhoneBookWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.AshokIt.PhoneBookWebApp.model.Contact;
import com.AshokIt.PhoneBookWebApp.service.ContactService;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class PhoneBookWebAppApplication  implements CommandLineRunner {
	
	@Autowired
	private ContactService cntctService;

	public static void main(String[] args)   {
		SpringApplication.run(PhoneBookWebAppApplication.class, args);

	}
	
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }


	@Override
	public void run(String... args) throws Exception {
		Contact cntct = new Contact();
		cntct.setFirstName("yared");
		cntct.setEmail("yared@gmail");
		cntct.setPhoneNumber("24242");
		
		cntctService.addContact(cntct);
		
	}

}
