package ie.atu.SpringBootProjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ie.atu.SpringBootProjects")
@SpringBootApplication
public class SpringBootProjectsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectsApplication.class, args);
	}

}
