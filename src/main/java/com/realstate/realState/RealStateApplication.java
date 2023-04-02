package com.realstate.realState;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class RealStateApplication {
@Bean
public PasswordEncoder getPasswordEncoder(){
	return new BCryptPasswordEncoder();
}

@Bean
public ModelMapper mapper(){
	return new ModelMapper();
}
	public static void main(String[] args) {
		SpringApplication.run(RealStateApplication.class, args);
	}

}
