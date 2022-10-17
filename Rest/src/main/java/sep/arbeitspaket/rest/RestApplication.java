package sep.arbeitspaket.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import sep.arbeitspaket.rest.adress.Adress;
import sep.arbeitspaket.rest.person.Person;
import sep.arbeitspaket.rest.person.PersonRepository;

@SpringBootApplication
public class RestApplication {

	@Autowired
	PersonRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("hello world, I have just started up");
		Adress adr = new Adress();
		adr.setCity("Essen");
		adr.setStreet("haa");
		Person per = new Person("Felix", "Farke", 2002, adr);
		repo.save(per);
	}
}
