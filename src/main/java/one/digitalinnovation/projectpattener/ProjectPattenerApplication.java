package one.digitalinnovation.projectpattener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectPattenerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectPattenerApplication.class, args);
	}

}
