import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notaLida = new ArrayList<>();

        System.out.println("Digite as notas que deseja armazenar abaixo (para parar digite -1): ");

            Double entrada;

            do {
            entrada = scanner.nextDouble();
            if (entrada != (-1)) {
            notaLida.add(entrada);
            }
            } while (entrada != (-1));

            System.out.println("Foram digitadas " + notaLida.size() + " notas");
            System.out.println("Notas informadas por ordem de digitação: \n" + notaLida);
 
            Collections.reverse(notaLida);

            System.out.println("Notas inseridas exibidas em ordem inversa: ");

            double somaNotas = 0;

            for (Double nota : notaLida) {
                System.out.println(nota);
                somaNotas += nota;
            }

            System.out.println("A soma das notas inseridas é: " + somaNotas);
            Double mediaNotas = somaNotas / notaLida.size();
            System.out.println("A media das notas é " + mediaNotas);

            int notasAcimaMedia = 0, notasAbaixoSete = 0;

            for (Double nota : notaLida ){
                if (nota > mediaNotas ){
                    notasAcimaMedia++;
                }
                if (nota < 7) {
                    notasAbaixoSete++;
                }

            }
            System.out.println("Valores acima da média: " + notasAcimaMedia);
            System.out.println("As notas abaixo de 7 foram: " + notasAbaixoSete);

            System.out.println("Programa encerrado!");

            scanner.close();
    }
}
