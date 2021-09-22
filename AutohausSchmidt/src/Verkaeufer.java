public class Verkaeufer {

    String _vorname;
    String _nachname;
    String _personalnummer;

    public Verkaeufer(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);
        //this.setPersonalnummer(personalnummer);
    }
    
    public String getNachname() {
        return _nachname;
    }
    //public String getPersonalnummer() {
        //return _personalnummer;
    //}
    public String getVorname() {
        return _vorname;
    }
    public void setNachname(String nachname) {
        _nachname = nachname;
    }
    //public void setPersonalnummer(String personalnummer) {
        //_personalnummer = personalnummer;
    //}
    public void setVorname(String vorname) {
        _vorname = vorname;
    }


    
}

