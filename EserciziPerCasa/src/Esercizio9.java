//Esercizio: Validazione di un indirizzo IP
//Scrivi un programma Java che chiede all'utente di inserire un indirizzo IP e verifica se l'indirizzo inserito è valido.
//Utilizza un'espressione regolare per convalidare la struttura dell'indirizzo IP,
// controllando che sia nel formato corretto (es. "xxx.xxx.xxx.xxx")
//e che ogni parte dell'indirizzo sia compresa tra 0 e 255. Fai in modo che il programma stampi
// "Indirizzo IP valido" o "Indirizzo IP non valido"
//a seconda dell'esito della convalida.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserire un indirizzo ip: ");
        String indirizzoIP = in.nextLine();

        String regex = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(indirizzoIP);


        while(matcher.find()){
            int primoGruppo = Integer.parseInt(matcher.group(1));
            int secondoGruppo = Integer.parseInt(matcher.group(2));
            int terzoGruppo = Integer.parseInt(matcher.group(3));
            int quartoGruppo = Integer.parseInt(matcher.group(4));
            if((primoGruppo >= 0 && primoGruppo <= 255) && (secondoGruppo >= 0 && secondoGruppo <= 255) && (terzoGruppo >= 0 && terzoGruppo <= 255) && (quartoGruppo >= 0 && quartoGruppo <= 255)){
                System.out.println("Indirizzo IP valido!");
            } else {
                System.out.println("Indirizzo IP non valido");
            }
        }
    }
}
