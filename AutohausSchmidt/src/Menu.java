import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;
public class Menu {

    Scanner _scanner;
    //Erstellt Klassenvariable Scanner 
    public Menu(){
        setScanner(new Scanner(System.in));
    }

    //Hier wird das Menu besschrieben, welches mit menu.startMenu aufgerufen wird
    public void startMenu()
    {
        System.out.println("Bitte wähle aus");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde ");
        System.out.println("(3) Neuer Verkäufer");
        System.out.println("(4) Neues Auto");
        System.out.println("(5) Zeige Autoliste");
        System.out.println("(6) Zeige Kundenliste");
        System.out.println("(7) Zeige Verkaeuferliste");

        String choice = getScanner().nextLine();
        System.out.println("Deine Asuwahl ist: " + choice); 
        

        if(choice.equals("1")){
            System.out.println("ham noch kein Verkauf");
        }
        
        else if(choice.equals("2")){
            createKundeMenu();
        }
        else if(choice.equals("3")){
            createVerkaeuferMenu();
        }
        else if(choice.equals("4")){
            createAutoMenu();
        }
        else if(choice.equals("5")){
            showAutos();
        }
        else if(choice.equals("6")){
            showKunden();
        }
        else if(choice.equals("7")){
            showVerkaeufer();
        }

        else {
            System.out.println("Wähle bitte 1-7 aus");
        }
        startMenu();
    }

    public void showAutos(){
        for(Auto auto : App.getAllAutos()) {
            if(auto != null){
                System.out.println(auto.getMarke() + " " + auto.getModell());
            }
        }
    }

    public void showKunden(){
        for(Kunde kunde : App.getAllKunden()) {
            if(kunde != null){
                System.out.println(kunde.getVorname() + " " + kunde.getNachname());
            }
        }
    }

    public void showVerkaeufer(){
        for(Verkaeufer verkaeufer : App.getAllVerkaeufer()) {
            if(verkaeufer != null){
                System.out.println(verkaeufer.getVorname() + " " + verkaeufer.getNachname());
            }
        }
    }






    public void createAutoMenu(){
        System.out.println("Erstelle ein Auto");
        System.out.print("Marke: ");
        String marke = getScanner().nextLine();
        System.out.print("Modell: ");
        String modell = getScanner().nextLine();
        System.out.println("Vielen Dank, dein Auto wird erstellt");

        App.addAuto(new Auto(marke, modell));

        startMenu();
    }

    public void createKundeMenu(){

        System.out.println("Erstelle einen Kunden");
        System.out.print("Vorname: ");
        String vorname = this.getScanner().nextLine();
        System.out.print("Nachname: ");
        String nachname = this.getScanner().nextLine();
        System.out.println("Vielen Dank, dein Kunde wird erstellt");

        App.addKunde(new Kunde(vorname, nachname));

        startMenu();

    }
    public void createVerkaeuferMenu(){
        System.out.println("Bitte Daten des Verkäufers eingeben");
        System.out.print("Vorname: ");
        String vorname = this.getScanner().nextLine();
        System.out.print("Nachname: ");
        String nachname = this.getScanner().nextLine();
        //System.out.print("Personalnummer");
        //String personalnummer = this.getScanner().nextLine();
        System.out.println("Vielen Dank, dein Verkaeufer wird erstellt");
        
        App.addVerkaeufer(new Verkaeufer(vorname, nachname));

        startMenu();
    }

    
    //Setter vom Scanner          
    public void setScanner(Scanner _scanner) 
    {
        this._scanner = _scanner;
    }
    //Getter vom Scanner
    public Scanner getScanner()
    {
        return _scanner;
    } 
    }



