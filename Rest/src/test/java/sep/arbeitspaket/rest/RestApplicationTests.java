package sep.arbeitspaket.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sep.arbeitspaket.rest.adress.Adress;
import sep.arbeitspaket.rest.person.Person;
import sep.arbeitspaket.rest.person.PersonRepository;

@SpringBootTest
class RestApplicationTests {

	@Autowired
	PersonRepository repo;

	@Test
	void contextLoads() {
		Adress adr = new Adress();
		adr.setCity("Essen");
		adr.setStreet("haa");
		Person per = new Person("Felix", "Farke", 2002, adr);
		repo.save(per);
		System.out.println(repo.suche("Essen").get(0).getVorname());
	}

}
