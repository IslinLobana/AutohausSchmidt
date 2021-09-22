public class App {
    

    static Auto[] _autos;
    static Kunde[] _kunden;
    static Verkaeufer[] _verkaeufer;
    //Main bedeutet den definierten Einstigspunkt des Programms
         public static void main(String[] args) throws Exception {
             //Erstellt neues Objekt vom Typ Menu 
            _autos = new Auto[8];
            _kunden = new Kunde[8];
            _verkaeufer = new Verkaeufer[8];

            _autos[0] = new Auto("VW", "Polo");
            _autos[1] = new Auto("BMW", "5er");
            _autos[2] = new Auto("Königsegg", "Agera R");
            _kunden[0] = new Kunde("Mathias", "Berg");
            _kunden[1] = new Kunde("Johann", "Jhonson");
            _verkaeufer[0] = new Verkaeufer("Janine", "Berghain");
            _verkaeufer[1] = new Verkaeufer("Hubertus", "Schuhmacher");

            Menu menu = new Menu();
            menu.startMenu();
        }
    
        public static void addAuto(Auto auto){
            _autos[0] = auto;
        }
        public static Auto[] getAllAutos(){
            return _autos;
        }

        public static void addKunde(Kunde kunde){
            _kunden[0] = kunde;
        }
        public static Kunde[] getAllKunden(){
            return _kunden;
        }

        public static void addVerkaeufer(Verkaeufer verkaeufer){
            _verkaeufer[0] = verkaeufer;
        }
        public static Verkaeufer[] getAllVerkaeufer(){
            return _verkaeufer;
        }
    }


    //HA Diese Listen für die ganzen anderen Sachen anwenden
    





               //Initialisieren von _autos
            




                //_autos[0] = new Auto("VW", "Polo");

                //System.out.println(_autos);
                //System.out.println(_autos[0]);
                //System.out.println(_autos[0].getMarke());




            //Die in den Klammern stehenden Parameter müssen zu den Datentypen passen (int zu int und String zu String und so weiter)
            //Auto a1 = new Auto("VW", "Polo", 2015);
            //Auto a2 = new Auto("Toyota", "Corolla", 2008);
            //Auto a3 = new Auto("Opel", "Corsa", 1990);
            //Kunde k1 = new Kunde("Mathis", "Müller", "Maximilianstraße", "364820475");
            //verkaeufer vk1 = new verkaeufer("Hubert", "Schuhmacher", 7485);
    
    
    
            
            // Methode im Menu Klasse in der ein auto erzeugt wird aber geben die Daten über menu ein mit dem Scanner
    