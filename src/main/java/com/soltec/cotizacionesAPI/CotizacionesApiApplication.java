package com.soltec.cotizacionesAPI;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableScheduling
@SpringBootApplication
public class CotizacionesApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(CotizacionesApiApplication.class, args);
	}

}
