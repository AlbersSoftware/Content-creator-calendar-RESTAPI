package com.AlbersSoftware.Contentcreatorcalendar;

import com.AlbersSoftware.Contentcreatorcalendar.model.Content;
import com.AlbersSoftware.Contentcreatorcalendar.model.Status;
import com.AlbersSoftware.Contentcreatorcalendar.model.Type;
import com.AlbersSoftware.Contentcreatorcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){

		return args -> {

				Content content = new Content( null,"First Vlog","my first vlog", Status.IDEA, Type.VIDEO, LocalDateTime.now(),null,"");
				repository.save(content);



		};
}

}
