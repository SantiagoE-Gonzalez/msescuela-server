package ar.com.santiagogonzalez.ejemplos.msescuelaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsescuelaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsescuelaServerApplication.class, args);
	}

}
