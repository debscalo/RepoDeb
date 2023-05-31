//Esercizio: Convalida di un numero di telefono
//Scrivi un programma Java che chiede all'utente di inserire un numero di telefono e verifica se il numero inserito è valido.
//Utilizza un'espressione regolare per convalidare la struttura del numero di telefono, ad esempio, controllando il formato corretto,
//eventualmente con prefisso internazionale e separazione dei gruppi di numeri.
//Fai in modo che il programma stampi "Numero di telefono valido" o "Numero di telefono non valido" a seconda dell'esito della convalida.


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire un numero di telefono: ");
        String numero = in.nextLine();

        String regex = "\\+\\d{2,3}\\s\\d{3}\\s\\d{3}\\s\\d{4}";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(numero);

        if(mat.find()){
            System.out.println("Il numero è valido");
        }
        else{
            System.out.println("Il numero non è valido");
        }
    }



}
