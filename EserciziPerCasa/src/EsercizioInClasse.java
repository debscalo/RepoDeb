import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class EsercizioInClasse {

    private String nome;
    private int eta;

    public EsercizioInClasse(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }
    public static void main(String[] args) {


        EsercizioInClasse ciao = new EsercizioInClasse("Mario", 35);

        List<EsercizioInClasse> listaEsercizio = Arrays.asList(
                new EsercizioInClasse("Mario", 23),
                new EsercizioInClasse("Luigi", 12),
                new EsercizioInClasse("Maria", 32)
        );

        Function<EsercizioInClasse, String> function = (esercizio)->{
            return "Nome: "+ esercizio.nome+ ", eta: "+ esercizio.eta;
        };

        Consumer<String> consumer = (stringa)->{System.out.println(stringa);};

        listaEsercizio.stream()
                .map(function)
                .forEach(consumer);

//        Supplier<String> supplier = ()->{
//            Random random = new Random();
//            String s = "";
//            for(int i = 0; i < 7; i++){
//                 s +=Character.toString(random.nextInt(97, 122));
//            }
//            return s;
//        };
//        System.out.println(supplier.get());


    }
}
