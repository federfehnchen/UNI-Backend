package sep.arbeitspaket.rest.adress;

import sep.arbeitspaket.rest.person.Person;

import javax.persistence.*;

@Entity
@Table(name = "Adresse")
public class Adress
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adresseID;
    private String city;
    private String street;
    @OneToOne(mappedBy = "adressID")
    private Person person;

    public Long getID() {
        return adresseID;
    }

    public void setID(Long ID) {
        this.adresseID = ID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Adress() {}
}
