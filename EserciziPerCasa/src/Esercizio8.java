//Esercizio: Estrazione di codici di prodotto
// (es: Lorem ipsum ABC123 dolor sit amet, consectetur XYZ456 adipiscing elit, sed LMN789 do eiusmod.";)
//Scrivi un programma Java che legge un testo da input e utilizza un'espressione regolare
// per estrarre tutti i codici di prodotto presenti nel testo.
//I codici di prodotto sono rappresentati da una sequenza di lettere maiuscole seguite da una sequenza di numeri.
//Fai in modo che il programma stampi i codici di prodotto estratti separatamente.


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio8 {

    public static void main(String[] args) {

        String testo = "Lorem ipsum ABC123 dolor sit amet, consectetur XYZ456 adipiscing elit, sed LMN789 do eiusmod.";

        String regex = "[A-Z]{3}[0-9]{3}";

        Pattern pattern = Pattern.compile((regex));
        Matcher matcher = pattern.matcher(testo);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
