import java.util.Random;

public class Gast {
        /*public static void main (String[] args) {
            Gast gast = new Gast();
            Gast gast2 = new Gast();
            Gast gast3 = new Gast();
            
            System.out.println(gast.toString());
            System.out.println(gast2.toString());
            System.out.println(gast3.toString());
        } */
    
    private static final String[] VOORNAMEN = {
        "Adam", "Sofie", "Johan", "Yuri", "Marie", "Fred", "Lisa", "Robin",
        "Claartje", "Freek", "Piet", "Pietje", "Erik", "Bas", "Pavlov", "Igor",
        "Ivan", "Geertje", "Klaas", "Snorri", "Anna", "Lotte", "Sara", "Roos",
        "Noor", "Thor", "Jean", "Karel", "Dick", "Richard", "Dzjengis", "Emma",
        "Howard Phillips", "Peter", "Sint", "Albert", "Dirk Jan", "Taylor",
        "Linus", "James", "Bjarne", "Jurriaan", "Jan-Klaassen"
    };
    
    private static final String[] ACHTERNAMEN = {
        "de Vries", "Smit", "Petersen", "Vonk", "Janssen", "Klaassen",
        "de Trompetter", "Baantjes", "de Jong", "Sanchez", "Bakker", "Eggertsson",
        "Sturluson", "Valjean", "de Grote", "Precies", "Khan", "Snorremans",
        "de Cock met C-O-C-K", "Stallman", "Lovecraft", "Erklaas", "Gagarin",
        "Einstein", "Heijn", "de Geer", "Swift", "Torvalds", "Gosling",
        "Stroustrup"
    };
    
    private final String voornaam;
    private final String achternaam;
    
    Gast(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }
    
    Gast() {
        int randomVoornaam = new Random().nextInt(VOORNAMEN.length);
        int randomAchternaam = new Random().nextInt(ACHTERNAMEN.length);
        this.voornaam = VOORNAMEN[randomVoornaam];
        this.achternaam = ACHTERNAMEN[randomAchternaam];
    }
    
    public String toString(){
        return voornaam + " " + achternaam;
    }
}