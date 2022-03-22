import java.util.*;
import java.io.*;


public class Main {
    //Farben für Buchstaben
    public static final String ANSI_YELLOW="\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN="\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {
        //Speichert gemachten Schaden und geschpielte Runden
       int RoundCounter=0;
       int Player1Damage;
       int Player2Damage;

       //Erschtellung der Ausrüstung
       LangSchwert Schwert = new LangSchwert();
       GroßSchield schield= new GroßSchield();
       SchwereRüstung Rüstung=new SchwereRüstung();
       KurzSchwert kurzSchwert=new KurzSchwert();
       KleinSchield kleinSchield=new KleinSchield();
       LeichteRüstung leichteRüstung=new LeichteRüstung();

       //Randomeiser für schadenberechung
       Random Player1Wurf= new Random();
       Random Player2Wurf= new Random();

       //Erschtellung der beiden Spieler
       Player1 Spieler1= new Player1(100.0F,kurzSchwert,schield);
       Player2 Speler2= new Player2(100.0F,Schwert,schield,Rüstung);

       //Überprüfung auf Schtrafen
       if(Spieler1.Player1Money<0 ){

           System.out.println(ANSI_RED+"Spieler 1 hat nicht genug Geld, er wird um 20 Lebenspunkten beschtraft"+ANSI_RESET);
           Spieler1.Player1Life= Spieler1.Player1Life-20;
       }else if(Speler2.Player2Money<0){
           System.out.println(ANSI_RED+"Spieler 2 hat nicht genug Geld, er wird um 20 Lebenspunkten beschtraft"+ANSI_RESET);
           Speler2.Player2Life= Speler2.Player2Life-20;
       }

        //Kampf
       while (Spieler1.Player1Life>0 | Speler2.Player2Life>0){
           if (Spieler1.Player1Life<=0){
               System.out.println(ANSI_GREEN+"Player 2 won the fight in "+RoundCounter+ " Rounds !!!"+ANSI_RESET);
               break;
           }else if (Speler2.Player2Life<=0){
               System.out.println(ANSI_GREEN+"Player 1 won the fight in "+RoundCounter+ " Rounds !!!"+ANSI_RESET);
               break;
           }

           Player1Damage=Player1Wurf.nextInt(Spieler1.Player1Pover);
           System.out.print(ANSI_BLUE+"Player 1 Made: "+ANSI_RESET);
           System.out.print(Player1Damage);
           System.out.println( ANSI_RED+"  Damage"+ANSI_RESET);

           Speler2.Player2Life=Speler2.Player2Life-Player1Damage;
           System.out.println("Player 2 have "+Speler2.Player2Life+" Life points");

           Player2Damage=Player2Wurf.nextInt( Speler2.Player2Pover);
           System.out.print(ANSI_YELLOW+"Palyer 2 Made: "+ANSI_RESET);
           System.out.print(Player2Damage);
           System.out.println( ANSI_RED+"   Damage"+ANSI_RESET);

           Spieler1.Player1Life= Spieler1.Player1Life-Player2Damage;
           System.out.println("Player 1 have "+Spieler1.Player1Life+" Life points");
           ++RoundCounter;
       }

    }
}
