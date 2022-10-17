package sep.arbeitspaket.rest.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sep.arbeitspaket.rest.adress.Adress;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController
{
    @Autowired
    private PersonRepository repo;

    @GetMapping("/findById")
    public Person findById(@RequestParam(defaultValue = "1") long id) {
        return repo.findById(id);
    }

    @GetMapping("/findByName")
    public List<Person> findByVorname(@RequestParam(defaultValue = "Felix") String vorname) {
        return repo.findByvorname(vorname);
    }

    @GetMapping("/findByCity")
    public List<Person> findByCity(@RequestParam(defaultValue = "Essen") String city) {
        return repo.suche(city);
    }

    @GetMapping("/findByAge")
    public List<Person> findByAge(@RequestParam(defaultValue = "-1") int lower, @RequestParam(defaultValue = "-1") int higher) {
        return repo.sucheAlter(2022-lower, 2022-higher);
    }

    @PostMapping(value = "/addPerson", consumes = "application/json")
    public Person addPerson(@RequestBody Person person) {
        repo.save(person);
        return person;
    }
}
