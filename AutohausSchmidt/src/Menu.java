import java.util.Scanner;
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

        String choice = getScanner().nextLine();
        System.out.println("Deine Asuwahl ist: " + choice); 
        

        if(choice.equals("1")){
            System.out.println("ham noch kein Verkauf");
        }
        
        else if(choice.equals("2")){
        System.out.println("ham noch keinen Kunden");
        }
        else if(choice.equals("3")){
            System.out.println("ham noch kein Verkäufer");
        }
        else if(choice.equals("4")){
            createAutoMenu();
        }
        else {
            System.out.println("Bist du blöd?");
        }
    }

    public void createAutoMenu()
    {
        System.out.println("Erstelle ein Auto");
        System.out.println("Marke");
        String marke = getScanner().nextLine();
        System.out.println("Modell");
        String modell = getScanner().nextLine();
        System.out.println("Vielen Dank, dein Auto wird erstellt");
        
        Auto a1 =new Auto(marke, modell);
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



