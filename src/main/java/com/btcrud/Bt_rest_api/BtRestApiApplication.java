package com.btcrud.Bt_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class BtRestApiApplication {

       @Bean
  public Docket productoApi() {
     return new Docket(DocumentationType.SWAGGER_2)
        .select() 
        .apis(RequestHandlerSelectors.any()) 
        .paths(PathSelectors.any()) 
        .build(); 
     
  }
	public static void main(String[] args) {
		SpringApplication.run(BtRestApiApplication.class, args);
	}

}
