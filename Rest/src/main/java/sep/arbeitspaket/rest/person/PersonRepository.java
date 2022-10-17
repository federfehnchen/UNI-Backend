package sep.arbeitspaket.rest.person;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>
{
    Person findById(long id);
    List<Person> findByvorname(String vorname);

    @Query(value = "SELECT p from Person p inner join p.adressID ar where ar.city = :stadt")
    List<Person> suche(@Param(value = "stadt") String stadt);

    @Query(value = "SELECT p from Person p where (birthyear<= :lower and birthyear>= :upper)")
    List<Person> sucheAlter(@Param(value = "lower") int lower, @Param(value = "upper") int upper);
}
