//        Esercizio: Ricerca di parole
//        Scrivi un programma Java che chiede all'utente di inserire una stringa da cercare nel testo x.
//        Utilizza un'espressione regolare per trovare tutte le occorrenze della parola nel testo.
//        stampa le posizioni delle occorrenze trovate nel testo.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserire una parola da cercare: ");
        String parolaDaCercare = in.nextLine();

        //String regex = "[a-zA-Z0-9]";
        String testo = "Io sono il testo in cui cercare la stringa, sono composto di un certo numero di parole e con le parole posso avere un certo numero di combinazioni";
        String regex = "[a-zA-Z0-9,]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testo);
        int pos = 0;

        while(matcher.find()){
            pos++;
            String parolaConfronto = matcher.group();
            if(parolaConfronto.matches(parolaDaCercare)){
                //String parolaTrovata = parolaConfronto;
                System.out.println("La parola è in posizione: "+ pos);
            }
        }
    }
}
