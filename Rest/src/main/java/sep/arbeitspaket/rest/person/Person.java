package sep.arbeitspaket.rest.person;

import sep.arbeitspaket.rest.adress.Adress;

import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String vorname;
    private String nachname;
    private int birthyear;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresseID")
    private Adress adresse;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public Adress getAdress() {
        return adresse;
    }

    public void setAdressID(Adress adress) {
        this.adresse = adress;
    }

    public Person(String vorname, String nachname, int birthyear, Adress adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.birthyear = birthyear;
        this.adresse = adresse;
    }

    public Person() {}
}
