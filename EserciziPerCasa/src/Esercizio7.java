//Esercizio: Ricerca e sostituzione di numeri romani
//Scrivi un programma Java che legge un testo da input e utilizza un'espressione regolare per
//individuare tutti i numeri romani presenti nel testo.
//Successivamente, converti ogni numero romano trovato nel corrispondente numero decimale e
// sostituisci il numero romano con il numero decimale nel testo.
//Fai in modo che il programma stampi il testo modificato.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio7 {

    public static void main(String[] args) {

        String testo = "Nel IX secolo si svolse una guerra iniziata nell'VII secolo, tutto ebbe inizio dai dissidi avvenuti tra le parti contundenti nel IV secolo";
        String regex = "\\b(IX|IV|V?I{0,3})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testo);

        while(matcher.find()){
            String s = matcher.group();
            int numero1 = 0;
            int numero2 = 0;
            int numero3 = 0;
            int somma = 0;
            if(s.length() == 1){
                String primo = "";
                primo += s.charAt(0);
                if(primo.equals("I")){
                    numero1 = 1;
                }else if(primo.equals("V")){
                    numero1 = 5;
                }else{
                    numero1 = 10;
                }
                s.replaceAll(s, Integer.toString(numero1));
            }else if(s.length() ==2){
                String primo = "";
                String secondo = "";
                primo += s.charAt(0);
                secondo += s.charAt(1);
                if(primo.equals("I")){
                    numero1 = 1;
                    if(secondo.equals("I")){
                        numero2 = 1;
                    }else if(secondo.equals("V")){
                        numero2 = 5;
                    }
                    else{
                        numero2 = 10;
                    }
                    if(numero1 < numero2){
                        somma = numero2 - numero1;
                    }else{
                        somma = numero1 + numero2;
                    }
                    s.replaceAll(s, Integer.toString(somma));
                }else if(primo.equals("V")){
                    numero1 = 5;
                    if(secondo.equals("I")) {
                        numero2 = 1;
                    }
                    somma = numero1+numero2;
                    s.replaceAll(s, Integer.toString(somma));
                }else{
                    numero1 = 10;
                    if(secondo.equals("I")){
                        numero2 = 1;
                    }else{
                        numero2 = 5;
                    }
                    somma = numero1+numero2;
                    s.replaceAll(s, Integer.toString(somma));
                }
            }else if(s.length() == 3){
                String primo = "";
                String secondo ="";
                String terzo ="";
                primo += s.charAt(0);
                secondo += s.charAt(1);
                terzo += s.charAt(2);
                if(primo.equals("I")){
                    numero1 = 1;
                    if(secondo.equals("I")){
                        numero2 = 2;
                    }
                    somma = numero1 + numero2;
                    s.replaceAll(s, Integer.toString(somma));
                }else if(primo.equals("V")){
                    numero1 = 5;
                    if(secondo.equals("I")) {
                        numero2 = 1;
                    }
                    if(terzo.equals("I")){
                        numero3 = 1;
                    }
                    somma = numero1+numero2 + numero3;
                    s.replaceAll(s, Integer.toString(somma));
                }else{
                    numero1 = 10;
                    if(secondo.equals("I")){
                        numero2 = 1;
                    }else{
                        numero2 = 5;
                    }
                    somma = numero1+numero2;
                    s.replaceAll(s, Integer.toString(somma));
                }
            }

//            if(s.length() == 1){
//                String primo = "";
//                primo += s.charAt(0);
//                switch (primo){
//                    case "I":
//                        matcher.group().replaceAll(primo, "1");
//                        break;
//                    case "V":
//                        matcher.group().replaceAll(primo, "5");
//                        break;
//                    case "X":
//                        matcher.group().replaceAll(primo, "10");
//                        break;
//                }
//            }else if(s.length() == 2) {
//                String secondo = "";
//                secondo += s.charAt(1);
//                switch (secondo) {
//                    case "I":
//                        if (secondo.equals("I")){
//                            matcher.group().replaceAll(secondo, "2");
//                        }else if(secondo.equals("V")){
//                            matcher.group().replaceAll(secondo, "4");
//                        }else{
//                            matcher.group().replaceAll(secondo, "9");
//                        }
//                        break;
//                    case "V":
//                        if (secondo.equals("I")){
//                            matcher.group().replaceAll(secondo, "6");
//                        }
//                        break;
//                    case "X":
//                        if (secondo.equals("I")){
//                            matcher.group().replaceAll(secondo, "11");
//                        }else if(secondo.equals("V")){
//                            matcher.group().replaceAll(secondo, "15");
//                        }
//                        break;
//                }
//            }else{
//                String terzo = "";
//                terzo += s.charAt(2);
//
//            }
        }



    }
}
