package com.proyecto.bodeguita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BodeguitaCibertecApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodeguitaCibertecApplication.class, args);
		
		
		
		
	}

}
