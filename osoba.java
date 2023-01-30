import java.util.*;

public class Osoba {
    private String imieNazwisko;
    private String email;
    private String krajZamieszkania;
    private int id;
    private static int idCounter = 1;

    public Osoba(String imieNazwisko, String email, String krajZamieszkania) {
        setImieNazwisko(imieNazwisko);
        setEmail(email);
        setKrajZamieszkania(krajZamieszkania);
        this.id = idCounter++;
    }

    public String getImieNazwisko() {
        return imieNazwisko;
    }

    public void setImieNazwisko(String imieNazwisko) {
        if (imieNazwisko == null || imieNazwisko.isEmpty()) {
            throw new IllegalArgumentException("Imie i Nazwisko nie moze byc puste");
        }
        this.imieNazwisko = imieNazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email nie moze byc pusty");
        }
        this.email = email;
    }

    public String getKrajZamieszkania() {
        return krajZamieszkania;
    }

    public void setKrajZamieszkania(String krajZamieszkania) {
        if (krajZamieszkania == null || krajZamieszkania.isEmpty()) {
            throw new IllegalArgumentException("Kraj zamieszkania nie moze byc pusty");
        }
        this.krajZamieszkania = krajZamieszkania;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Osoba [imieNazwisko=" + imieNazwisko + ", email=" + email + ", krajZamieszkania=" + krajZamieszkania
                + ", id=" + id + "]";
    }

    public static void main(String[] args) {
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Bruce Rutledge", "quam.pellentesque@outlook.couk", "Indonesia"));
        osoby.add(new Osoba("Abbot Wolf", "consectetuer.rhoncus@google.org", "Ukraine"));
        osoby.add(new Osoba("Gwendolyn Becker", "massa@hotmail.edu", "South Korea"));
        osoby.add(new Osoba("Amethyst York", "egestas.lacinia@outlook.ca", "Nigeria"));
        osoby.
    }
}
