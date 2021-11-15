public abstract class Angajat {
    private String nume;
    private String adresa;
    private int salariu;
    private String detalii_post;

    public Angajat(String nume, String adresa, int salariu, String detalii_post) {
        this.nume = nume;
        this.adresa = adresa;
        this.salariu = salariu;
        this.detalii_post = detalii_post;
    }

    public Angajat() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String getDetalii_post() {
        return detalii_post;
    }

    public void setDetalii_post(String detalii_post) {
        this.detalii_post = detalii_post;
    }
}