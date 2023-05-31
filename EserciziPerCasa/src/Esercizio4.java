//Esercizio: Estrazione di dati da una stringa
//Scrivi un programma Java che chiede all'utente di inserire una stringa contenente informazioni strutturate,
//ad esempio una stringa nel formato "Nome: John, Cognome: Doe, Età: 25".
//Utilizza espressioni regolari per estrarre i valori dei diversi campi dalla stringa (come nome, cognome ed età)
//e stampali separatamente.


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserire il nome: ");
        String nome = in.nextLine();
        System.out.println("Inserire il cognome: ");
        String cognome = in.nextLine();
        System.out.println("Inserire l'età: ");
        String eta = in.nextLine();

        String dati = "Nome: "+ nome + ", Cognome: "+ cognome+ ", Età: "+ eta;
        String regex = ":\\s[a-zA-Z0-9]+";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(dati);

        while(mat.find()){
            String s = mat.group();
            String estratti = s.replaceAll(":\\s", "");
            System.out.println(estratti);
        }
    }
}
