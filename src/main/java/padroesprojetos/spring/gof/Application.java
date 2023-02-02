package padroesprojetos.spring.gof;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot Maven
 * - Spring Data JPA
 * - Spring Web
 * - MySQL
 * - OpenFeign
 * - OpenAPI
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public String PORT = System.getenv("PORT");


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
