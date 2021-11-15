import java.util.List;

public class Departament implements Categorie{
    private List<Angajat> angajati;
    private List<Departament_Secund> departamente_secunde;
    String categorie;

    @Override
    public String print_message() {
        return categorie;
    }

    public Departament(List<Angajat> angajati, List<Departament_Secund> departamente_secunde, String categorie) {
        this.angajati = angajati;
        this.departamente_secunde = departamente_secunde;
        this.categorie = categorie;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajat> angajati) {
        this.angajati = angajati;
    }

    public List<Departament_Secund> get departamente_secunde() {
        return departamente_secunde;
    }

    public void setdepartamente_secunde(List<Departament_Secund> departamente_secunde) {
        this.departamente_secunde = departamente_secunde;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}