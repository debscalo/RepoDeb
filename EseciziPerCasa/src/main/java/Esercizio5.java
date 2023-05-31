//Esercizio: Convalida della password
//Scrivi un programma Java che chiede all'utente di inserire una password e verifica se
// la password inserita rispetta determinati requisiti di complessità.
//Utilizza un'espressione regolare per convalidare la password, ad esempio, controllando
// la lunghezza minima, la presenza di lettere maiuscole, minuscole, numeri e caratteri speciali.
//Fai in modo che il programma stampi "Password valida" o "Password non valida" a seconda dell'esito della convalida.


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserire una password: ");
        String password = in.nextLine();

        String reg = "[a-z]+[A-z]+[0-9]+";
        Pattern pat = Pattern.compile(reg);
        Matcher mat = pat.matcher(password);

//        if(mat.matches()){
//            System.out.println("La password è valida");
//        }else{
//            System.out.println("La password non è valida");
//        }

        if(password.contains("[a-z]") && password.contains("[A-Z") && password.contains("[0-9]") ){
            System.out.println("La password è valida");
        }else{
           System.out.println("La password non è valida");
        }
    }
}
