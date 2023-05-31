//Esercizio: Filtraggio di parole offensive
//Scrivi un programma Java che chiede all'utente di inserire una stringa e filtra le parole offensive.
//Utilizza un'espressione regolare per individuare le parole offensive nel testo e sostituiscile con asterischi
//Fai in modo che il programma stampi il testo filtrato.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire una frase: ");
        String frase = in.nextLine();

        List<String> listaParoleProibite = new ArrayList<>();
        listaParoleProibite.add("stupido");
        listaParoleProibite.add("brutto");
        listaParoleProibite.add("cattivo");

        String regex = "[a-zA-Z,]+";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(frase);


        String ne = "";
        boolean trovato = false;
        String m = "";
        while(mat.find()){
            m = mat.group();
             trovato = false;
            for(String elem: listaParoleProibite){
                if(elem.matches(m) ){
                    ne += m.replaceAll(m, "****** ");
                    trovato = true;
                    break;
                }

            }
            if(!(ne.contains("\\b"+m) || trovato)){
                ne += m+" ";
            }
        }
        System.out.println(ne);

    }
}
