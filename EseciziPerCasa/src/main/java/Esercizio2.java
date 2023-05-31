//Esercizio: Sostituzione di testo
//Scrivi un programma Java che chiede all'utente di inserire una stringa da cercare e una parola da sostituire.
//Utilizza un'espressione regolare per trovare tutte le occorrenze della parola da cercare nel testo e
// sostituirle con la parola specificata dall'utente.
//stampa il testo modificato.


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserire una stringa da cercare: ");
        String str = in.nextLine();
        System.out.println("Inserire una stringa con cui sostituirla: ");
        String sost = in.nextLine();

        String testo = "Io sono il testo in cui cercare la stringa, sono composto di un certo numero di parole e con le parole posso avere un certo numero di combinazioni";

        String regex = "[a-zA-Z0-9,]+";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(testo);

        String frase = "";
        while(mat.find()){
            String s = mat.group();
            if (s.matches(str)) {
                frase += s.replaceAll(str, sost+" ");
            }else{
                frase += s+" ";
            }

        }
        System.out.println(frase);
    }




}
