package com.loginRegisterflutter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
public class LoginRegisterflutterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterflutterApplication.class, args);
	}
	
	
	/*
	 api test
	 http://localhost:8081/users/login
	{
      "username": "test1",
      "password": "test1"
     }
     http://localhost:8081/users/register
     {
	"firstname":"test1",
	"lastname":"test2",
	"email": "test3",
    "password": "test"
}
	 */

}
