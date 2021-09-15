public class Kunde {
    

    String _vorname;
    String _nachname;
    String _adresse;
    String _telefon;
    // Kontruktor = Methode die aufgerufen wird wenn eine neue Instanz einer Klasse erstellt wird
    public Kunde(String vorname, String nachname, String adresse, String telefon){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAdresse(adresse);
        this.setTelefon(telefon);
    }
    public String getVorname(){
        return _vorname;
    }
    public String getNachname() {
        return _nachname;
    }
    public String getAdresse() {
        return _adresse;
    }
    public String getTelefon() {
        return _telefon;
    }
    // SETTER 
    public void setVorname(String vorname){
        _vorname = vorname;
    }
    public void setNachname(String nachname) {
        _nachname = nachname;
    }
    public void setAdresse(String adresse) {
        _adresse = adresse;
    }
    public void setTelefon(String telefon) {
        _telefon = telefon;
    }
}

