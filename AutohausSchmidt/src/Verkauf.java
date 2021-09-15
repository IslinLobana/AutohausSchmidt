public class Verkauf {
    Auto _auto;
    Kunde _kunde;
    int _preis;
    Verkaeufer _verkaeufer;

    public Auto getAuto() {
        return _auto;
    }
    public Kunde getKunde() {
        return _kunde;
    }
    public int getKreis() {
        return _preis;
    }
    public Verkaeufer getVerkaeufer() {
        return _verkaeufer;
    }
    public void setAuto(Auto auto) {
        _auto = auto;
    }
    public void setKunde(Kunde kunde) {
        _kunde = kunde;
    }
    public void setPreis(int preis) {
        _preis = preis;
    }
    public void setVerkaeufer(Verkaeufer verkaeufer) {
        _verkaeufer = verkaeufer;
    }


}