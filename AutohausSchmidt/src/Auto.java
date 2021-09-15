public class Auto {
    String _marke;
    String _modell;
    int _preis;
    int _baujahr;


    public Auto(String marke, String modell){
        this.setMarke(marke);
        this.setModell(modell);
    }

    public int getBaujahr() {
        return _baujahr;
    }
    public String getMarke() {
        return _marke;
    }
    public String getModell() {
        return _modell;
    }
    public int getPreis() {
        return _preis;
    }
    public void setBaujahr(int baujahr) {
        _baujahr = baujahr;
    }
    public void setMarke(String marke) {
        _marke = marke;
    }
    public void setModell(String modell) {
        _modell = modell;
    }
    public void setPreis(int preis) {
        _preis = preis;
    }

}
